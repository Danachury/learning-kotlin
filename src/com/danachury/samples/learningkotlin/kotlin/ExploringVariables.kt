package com.danachury.samples.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    /*** String ***/

    // Mutable
    var name = "Denilson"

    // Immutable
    val surname = "Anachury"

    name = "Some other Name"

    println("Hello $name ${surname.toUpperCase()}")
    println("The \$name variable has ${name.length} characters")
    println("Your product cost \$about10")

    val story = """It wa a dark and stormy night.
        |A foul smell crept across the city.
        |Jane wondered what time it was. and when it would be daylight.
    """.trimMargin()
    println(story)

    val changedStory = story.replaceAfterLast("it", " would be dawn.")

    println(changedStory)

    /*** Double ***/

    val myDouble = 21.4

    println("Is \$myDouble a Double? ${myDouble is Double}")
    println("\$myDouble is a ${myDouble::class.qualifiedName}")

    println("\$myDouble's javaClass is ${myDouble.javaClass}")

    /*** Int ***/

    val myInteger = myDouble.roundToInt()
    println("\$myDouble is a ${myInteger::class.qualifiedName}")

    val anotherInteger: Int = 17

    /*** Float ***/

    val myFloat: Float = 13.6f
    val myFloatPlusAnotherIntegerResult = myFloat + anotherInteger
    println("\$myFloatPlusAnotherIntegerResult value is $myFloatPlusAnotherIntegerResult")

    /*** BigDecimal ***/

    val myBigDecimal = BigDecimal(17)
    val myBigDecimal2: BigDecimal

    println("Hello")

    myBigDecimal2 = myBigDecimal.add(BigDecimal(30))
}
