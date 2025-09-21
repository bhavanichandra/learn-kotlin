package com.themuler.learning.another

import com.themuler.learning.CompanyCommunications as Com // This is great feature
//import com.themuler.learning.topLevel as tp // cannot use it as topLevel is private
import com.themuler.learning.Department.*
import com.themuler.learning.upperFirstAndLast as ufal

fun main(args: Array<String>) {
//    tp("Calling from Anther.kt file in com.themuler.learning.another package")
    println(Com.getCopyrightLine())
    println(HR.getDeptInfo())
    println("some string".ufal())
}
