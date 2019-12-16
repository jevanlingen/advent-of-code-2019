package day.one

import kotlin.math.max
import kotlin.math.floor
import kotlin.math.roundToInt

fun calculateFuelIncludingMassOfFuelItself(mass: Int): Int {
    var calculateFuel = max(calculateFuel(mass), 0)

    if (calculateFuel > 0)
        calculateFuel += calculateFuelIncludingMassOfFuelItself(calculateFuel)

    return calculateFuel
}

fun getAllFuelIncludingMassOfFuelItself(): Int = getPuzzleInput()
    .map(::calculateFuelIncludingMassOfFuelItself)
    .sum()

fun main() {
    println(getAllFuelIncludingMassOfFuelItself())
}


