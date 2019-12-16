package day.four

fun hasExactlyTwoAdjacentDigits(list: List<Int>) = list.groupBy { it }.values.any{it.size == 2}

fun couldBeAPasswordTwo(number: Int) =
    couldBeAPassword(number) && hasExactlyTwoAdjacentDigits(transformNumberToList(number))

fun main() {
    println(
        getPossiblePassword { couldBeAPasswordTwo(it) }
    )
}