package com.danachury.samples.learningkotlin.kotlin

fun main(args: Array<String>) {

    /*** Immutable list ***/
    val colors = listOf("Red", "Green", "Blue")
    println(colors::class.qualifiedName)

    /*** Mutable list ***/
    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    val numbers = mutableListOf<Int>()

    /*** Maps and Sets ***/
    val months = mutableSetOf("Jan", "Feb")
    val webColors = mapOf("red" to "FF0000", "blue" to "00FF00")

    /*** Arrays ***/
    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.set(3, -4)
    intArray[2] = -7
    intArray.forEach { println(it) }

}
