package com.themuler.learning.third

fun arrayNulls() {
    val nullableInts = arrayOfNulls<Int>(5)
    nullableInts.forEach(::println)
    println("ToString: ${nullableInts[3]}")
}

fun nullCheck(str: String?) {
//    println(str?.uppercase()) // Use ? instead of if check similar to javascript

    println(str?.uppercase() ?: "str is null") // use elvis operator ?: to define default value
//    if (str == null) {
//        println(str)
//    } else {
//        println(str.uppercase())
//    } // This is shorthand for above ?

//    val countryCode: String? = bankBranch?.address?.country?.code;
}

fun safeCast() {
    val something: Any = arrayOf(1, 2, 3)
    val str = something as? String
    println(str?.uppercase())
}

fun strIsNotNull() {
    val str: String? = null
    val str2 = str!!
    val str3 = str2.uppercase()
    println(str3)
//    val countryCode: String? = bankBranch||.address||.country||.code; // Don't do this
}

fun printText(text: String) {
    println(text)
}

fun usingLet() {
    val text: String? = "Hello"
//    if(text != null) {
//        println(text)
//    } // Short hand for this if check:   text?.let { println(it) }
    text?.let { println(it) }
}
