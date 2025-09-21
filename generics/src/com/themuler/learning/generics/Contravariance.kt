package com.themuler.learning.generics

fun main(args: Array<String>) {
    val flowerTender = object : FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm, pruning a ${flower.name}!")
    }
    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(1)

    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2)

}

class Garden<T : Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {

}

class Rose : Flower("Rose") {
}

class Daffodil : Flower("Daffodil") {}

interface FlowerCare<in T> { // We cannot have read functions when Contravariance
    fun prune(flower: T)
}
