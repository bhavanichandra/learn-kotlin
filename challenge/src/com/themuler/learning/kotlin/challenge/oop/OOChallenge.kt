package com.themuler.learning.kotlin.challenge.oop

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) = {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear, with a cadence of $cadence, travelling at a speed of  $speed")
    }
}

class KotlinMountainBike(cadence: Int, speed: Int, var seatHeight: Int, gear: Int = 3) :
    KotlinBicycle(cadence, speed, gear) {


    constructor(color: String, cadence: Int, speed: Int, seatHeight: Int, gear: Int = 3) : this(
        cadence,
        speed,
        seatHeight,
        gear
    ) {
        println("Mountain bike has a color $color")
    }

    override fun printDescription() {
        super.printDescription()
        println("The seat height of Mountain Bike is $seatHeight inches")
    }

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")

    }
}

class KotlinRoadBike(cadence: Int, speed: Int, val tireWidth: Int, gear: Int = 5) :
    KotlinBicycle(cadence, gear, speed) {
    override fun printDescription() {
        super.printDescription()
        println("The tire width of Road Bike is $tireWidth MM")
    }
}

fun main(args: Array<String>) {
//    val bicycle = KotlinBicycle(1, 2, 3)
//    bicycle.printDescription()
//    println("-----------")
//    val mountainBike = KotlinMountainBike(10, 3, 10, 3)
//    mountainBike.printDescription()
//    println("-----------")
//    val roadBike = KotlinRoadBike(11, 3, 500, 5)
//    roadBike.printDescription()
//    println("-----------")
//    val bicycle2 = KotlinBicycle(1, 2)
//    bicycle2.printDescription()
//    println("-----------")
//    val mountainBike2 = KotlinMountainBike(10, 4, 10)
//    mountainBike2.printDescription()
//    println("-----------")
//    val roadBike2 = KotlinRoadBike(11, 4, 500)
//    roadBike2.printDescription()
//    println("-----------")
    val mountainBike3 = KotlinMountainBike("red", 10, 4, 10)
    mountainBike3.printDescription()
    println("-----------")
    for (color in KotlinMountainBike.availableColors) {
        print("$color ")
    }

}
