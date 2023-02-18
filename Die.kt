// Name: Anish Acharya
// Student Number: A00263391
// Program: Lab 3 - Classes/Objects

import kotlin.random.Random

class Die {
    var name: String = "d6"
    var number_of_sides: Int = 6
    var current_side_up: Int = 0

    fun roll() {
        this.current_side_up = Random.nextInt(1,number_of_sides + 1)
    }
    fun setToHighest() {
        current_side_up = number_of_sides
    }

    fun showDie() {
        println("The current side up for $name is $current_side_up")
    }

    constructor() {

        roll()
        println("A new => default d6 die has been created.")
    }

    constructor(_number_of_sides: Int) {
        this.name = "d$_number_of_sides"
        this.number_of_sides = _number_of_sides
        roll()
        println("A new => " + this.name + " die has been created.")
    }

    constructor(_number_of_sides: Int, _name: String) {
        this.name = _name
        this.number_of_sides = _number_of_sides
        roll()
        println(
                "A new => " +
                        this.name +
                        " die => a special die d" +
                        number_of_sides +
                        " has been created."
        )
    }
}


