package com.themuler.learning.collections

fun main(args: Array<String>) {
    val seasons = listOf("spring", "summer", "winter", "fall", "summer")
    val colorList = arrayOf("black", "white", "green", "black", "green")

    val mutableSeasons = seasons.toMutableList()
    mutableSeasons.add("Test Season")
    println(mutableSeasons)

    println(seasons.last()) // Easy to get last value from a list

    println(seasons.reversed())
//    if(seasons.size > 5) {
//        println(seasons[5])
//    }
    println(seasons.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    println(colorList.zip(seasons))

    val mergedList = listOf(colorList, colorList)
    println(mergedList)

    val combinedList = colorList + seasons
    println(combinedList)

    val uniqueList = colorList.union(seasons)
    println(uniqueList)

    val uniqueColors = colorList.distinct()
    println(uniqueColors)

}

fun basics() {

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("Another String", null)
    println(notNullList)

    val arrayList = arrayListOf("Another", "String")
    println(arrayList.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    println(mutableList.javaClass)

    println(mutableList[2])
    mutableList[2] = 20
    println(mutableList[2])

    val array = arrayOf("black", "white", "green")
//    val colorList = listOf(*array) -> this creates immutable array list
    val colorList = array.toList()
    println(colorList.javaClass)
    println(colorList)

    val ints = intArrayOf(1, 2, 3)
    println(ints.javaClass)
    println(ints.toList())
    println(ints.toList().javaClass)


}