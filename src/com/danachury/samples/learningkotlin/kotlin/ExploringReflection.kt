package com.danachury.samples.learningkotlin.kotlin

import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.functions

fun isPrime(a: Int): Boolean {
    val max = sqrt(a.toDouble()).roundToInt()
    // return (2..max)
    //    .filter { a % it == 0 }
    //    .map {  }
    for (i in 2..max)
        if (a % i == 0)
            return false
    return true
}

fun main(args: Array<String>) {

    val myList = listOf(14, 15, 16, 17, 18, 19, 20)

    /**
     * Reflection example access
     */
    val filterMethod = myList.filter(::isPrime)
    println(filterMethod)

    val functionsInList = myList::class.declaredFunctions
    println(functionsInList)
}
