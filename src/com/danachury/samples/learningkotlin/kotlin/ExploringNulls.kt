package com.danachury.samples.learningkotlin.kotlin

fun main(args: Array<String>) {

    var name: String? = null

    // Next line represents unknown value for compiler
    // name = "Denilson"

    // Option One (Null-Safe Operator)
    println("$name".toUpperCase())

    // Option Two (Null-Safe Operator)
    println(name?.toUpperCase())

    // Option Three (Check and Smart Cast)
    if (name != null)
        println(name.toUpperCase())

    // Option Four (Non-null Assert Operator) - (Throws @KotlinNullPointerException) - (Not recommended)
    println(name!!.toUpperCase())

    /*** Nothing Object type ***/

    var address = null
}
