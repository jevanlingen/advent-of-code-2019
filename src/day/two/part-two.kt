package day.two

import java.lang.RuntimeException

fun determineArguments(requiredOutput: Int): Pair<Int, Int> {
    for (i in 1..99) {
        for (k in 1..99) {
            if (getOutput(getPuzzleInput(), i, k) == requiredOutput) {
                return Pair(i, k)
            }
        }
    }

    throw RuntimeException("No output found")
}

fun main() {
    val getArguments = determineArguments(19690720)

    println(getArguments)
    println(100 * getArguments.first + getArguments.second)
}