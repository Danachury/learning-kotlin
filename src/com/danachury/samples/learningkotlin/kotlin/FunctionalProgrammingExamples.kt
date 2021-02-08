package com.danachury.samples.learningkotlin.kotlin

import com.danachury.samples.learningkotlin.kotlin.util.apply
import com.danachury.samples.learningkotlin.kotlin.util.toSentenceCase
import kotlin.math.max

fun main(args: Array<String>) {
    val result = apply("hello", ::toSentenceCase)
    val result2 = apply("hello") { it.toUpperCase() }
    println(result)
    println(result2)

    val colors = listOf(
        "red",
        "green",
        "blue",
        "black"
    )

    val uppercaseColors = colors.map { it.toUpperCase() }

    uppercaseColors.forEach(::println)

    println("Colors starts with: b")
    colors
        .filter { it.startsWith("b") }
        .forEach(::println)

    println("Duplicate colors that starts with: b")
    colors
        .flatMap { if (it.startsWith("b")) listOf(it, it) else listOf(it) }
        .forEach(::println)

    println("Reduce list to a single String")
    println(colors.reduce { s, value -> "$s, $value" })

    println("Operations over list of numbers")
    val numbers = colors.map { it.length }
    println(numbers.sum())
    println(numbers.average())
    println(numbers.count())

    println(numbers.fold(0) { r, value -> r + value })
    println(numbers.fold(0) { r, value -> max(r, value) })

    println("Using Maps -> Filters -> Destructuring")
    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    myMap
        .filter {(_, v) -> v.startsWith("t") }
        .forEach(::println)
}
