package com.danachury.samples.learningkotlin.kotlin

import java.util.*

fun main(args: Array<String>) {
    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3))
    val jane = KotlinPerson(1L, "Mrs", "Jane", "Green")
    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988, 5, 3))}")

    /*** Assigning conditional result to variable ***/
    val olderPerson = if (john.age > jane.age) john else jane
    println("The older person is $olderPerson")

    /*** Elvis operator ***/
    val nullableInt: String? = null
    println("String value is: ${nullableInt?.toUpperCase() ?: "Hey!"}")
}
