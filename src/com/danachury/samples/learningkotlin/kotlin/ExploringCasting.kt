package com.danachury.samples.learningkotlin.kotlin

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    // See Java Code [BoringJavaCode]
    var result: Any
    val randomNumber = Random().nextInt(3)

    if (randomNumber == 1) {
        result = BigDecimal(30)
    } else
        result = "hello"

    println("Result is currently $result")

    if (result is BigDecimal)
    // add() 47
        result = result.add(BigDecimal(47))
    else
    // toUppercase()
        result = (result as String).toUpperCase()

    println("Result is currently $result")
}
