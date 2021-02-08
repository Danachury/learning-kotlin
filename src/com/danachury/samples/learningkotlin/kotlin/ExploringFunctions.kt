package com.danachury.samples.learningkotlin.kotlin

import java.util.function.Function

private fun printAString(value: String) {
    println(value)
}

// Single expression Function
fun addToNumbers(one: Double, two: Double) =
    one + two

fun printSomeMaths(one: Double = 6.2, two: Double = 3.9) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    fun funWithingAFun(a: String) {
        println(a)
    }

    funWithingAFun("Hello function within a function")
}

fun mathodTakesALambda(input: String, action: (String) -> Int) {
    println(action(input))
}


fun main(args: Array<String>) {
    printAString("Hello world!")
    println(addToNumbers(17.3, 3.6))
    printSomeMaths(two = 17.3, one = 3.6)
    printSomeMaths(5.6)
    printSomeMaths(two = 5.6)
    printSomeMaths()
}
