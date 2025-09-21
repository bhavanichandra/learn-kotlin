package com.themuler.learning.challenge


fun main(args: Array<String>) {
    challenge2()
}

fun challenge1() {
    val hello1 = "Hello";
    val hello2 = "Hello";
    println("hello1: $hello1. hello2: $hello2")

    println("Referential Equality: ${hello1 === hello2}")
    println("Structural Equality: ${hello1 == hello2}")

    var number = 2988
    println("Number: $number")

    var anotherVal: Any = "The Any type is the root of the kotlin class hierarchy"

    if (anotherVal is String) {
        println(anotherVal.uppercase())
    }

    println(
        """
            1
           11
          111
         1111  
    """.trimIndent()
    )
    println(
        """    11
        1   11
        1  111
        1 1111
    """.trimMargin("1")
    )

}

fun challenge2() {
    val float1: Float? = -3847.384f // Use this
    val float2: Float? = -3847.384.toFloat()

    val shortArray = arrayOf<Short>(1, 2, 3, 4, 5)
    val shortArray2 = Array(5) { i -> i.toShort() }
    val shortArray3 = shortArrayOf(1, 2, 3, 4, 5)
    println(shortArray === shortArray2)

    val nullableArrayInts = Array<Int?>(40) { i -> (i + 1) * 5 }
    for (i in nullableArrayInts) {
        print("$i ")
    }

//    val charArray = arrayOf('a', 'b', 'c')
//    Challenge().method1(charArray.toCharArray())
    println()
    val charArray = charArrayOf('a', 'b', 'c')
    Challenge().method1(charArray)


    val x: String? = "I AM IN UPPERCASE"
//    val x: String? = null
    val y = x?.lowercase() ?: "I Give up!"
    println(y)

//    println(x?.let { "I AM NOT IN UPPERCASE" })
    println(x?.let { it.lowercase().replace("am", "am not") })
}
