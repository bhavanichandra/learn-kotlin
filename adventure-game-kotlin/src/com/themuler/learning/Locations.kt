package com.themuler.learning

import java.io.File

fun readLocationInfo(): Map<Int, Location> {
    val locations = mutableMapOf<Int, Location>()

    File("locations_big.txt").reader().forEachLine {
        val (locationId, description) = it.split("`")
        val location = Location(locationId.toInt(), description)
        locations[location.locationId] = location
    }

    File("directions_big.txt").reader().forEachLine {
        val (currentLocation, direction, nextLocation) = it.split(",")
        locations[currentLocation.toInt()]?.addExit(direction, nextLocation.toInt())
    }
    return locations
}
