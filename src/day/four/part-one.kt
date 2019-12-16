package day.four

fun transformNumberToList(number: Int) = number.toString().map(Character::getNumericValue)

fun digitsDoNotDecrease(list: List<Int>) = list.foldIndexed(true, { idx, acc, it ->
    if (idx == 0)
        true
    else if (!acc)
        false
    else
        list[idx - 1] <= it
})

fun hasAdjacentDigits(list: List<Int>) = list.groupBy { it }.values.any { it.size >= 2 }

fun couldBeAPassword(number: Int) = transformNumberToList(number).let {
    digitsDoNotDecrease(it) && hasAdjacentDigits(it)
}

fun getPossiblePassword(filter: (Int) -> Boolean): Int {
    return (137683..596253).toList()
        .filter { filter(it) }
        .count()
}

fun main() {
    println(
        getPossiblePassword { couldBeAPassword(it) }
    )
}