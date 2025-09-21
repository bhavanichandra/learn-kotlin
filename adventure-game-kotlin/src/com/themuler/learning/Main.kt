package com.themuler.learning

import kotlin.random.Random

fun main(args: Array<String>) {
    val locations = readLocationInfo()
    var loc = Random.nextInt(0, 145)
    while (true) {
        val location = locations[loc] ?: Location(0, "Something went wrong. Terminating the game!")
        println(location.description)
        if (location.locationId == 0) {
            break
        }
        print("Available exists are: ")
        location.exists.keys.forEach {
            print("$it, ")
        }
        val direction = readlnOrNull()?.uppercase() ?: "Z"

        if (location.exists.containsKey(direction)) {
            loc = location.exists[direction]!!
        } else {
            println("You cannot go there!")
        }
    }

}