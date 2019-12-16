package day.two

import day.one.getAllFuel

enum class Operator {
    ADD, MULTIPLY
}

fun executeOperation(list: MutableList<Int>, index: Int, operator: Operator): MutableList<Int> {
    val first = list[list[index + 1]]
    val second = list[list[index + 2]]

    when (operator) {
        Operator.ADD -> list[list[index + 3]] = first + second
        Operator.MULTIPLY -> list[list[index + 3]] = first * second
    }

    return list;
}

fun executeOperationOne(list: MutableList<Int>, index: Int) = executeOperation(list, index, Operator.ADD)

fun executeOperationTwo(list: MutableList<Int>, index: Int) = executeOperation(list, index, Operator.MULTIPLY)

fun runProgram(list: MutableList<Int>): MutableList<Int> {
    var changingList = list;
    for (x in 0 until list.size step 4) {
        if (changingList[x] == 1) {
            changingList = executeOperationOne(changingList, x)
        } else if (changingList[x] == 2) {
            changingList = executeOperationTwo(changingList, x)
        } else if (changingList[x] == 99) {
            break
        }
    }

    return changingList
}

fun getOutput(list: MutableList<Int>, argOne: Int, argTwo: Int): Int {
    list[1] = argOne
    list[2] = argTwo

    return runProgram(list)[0]
}

fun main() {
    println(getOutput(getPuzzleInput(), 12, 2))
}