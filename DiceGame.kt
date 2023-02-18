// Name: Anish Acharya
// Student Number: A00263391
// Program: Lab 3 - Classes/Objects

import Die

fun main() {
    var array = arrayOf(Die(), Die(20), Die(25, "twentyfive"))

    for (i in array) {
        i.roll()
        println("The die has been rolled. The result is ${i.current_side_up}")
    }

    println("\nSetting the ${array[1].name} to show 20...")
    array[1].setToHighest()
    println("The side up is now ${array[1].current_side_up}.")

    println("\nCreating 5 d6...")
    val d6s = List(5) { Die() }
    var numRolls = 0
    while (d6s.map { it.current_side_up }.distinct().size != 1) {
        d6s.forEach { it.roll() }
        numRolls++
    }

    println("YAHTZEE! It took $numRolls rolls to get " + d6s[0].current_side_up + " on all dies")
}