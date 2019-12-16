package day.one

import kotlin.math.floor
import kotlin.math.roundToInt

fun calculateFuel(mass: Int): Int = floor((mass / 3).toDouble()).roundToInt() - 2

fun getAllFuel(): Int = getPuzzleInput()
    .map(::calculateFuel)
    .sum()

fun main() {
    println(getAllFuel())
}


