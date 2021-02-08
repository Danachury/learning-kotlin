package com.danachury.samples.learningkotlin.kotlin

fun main(args: Array<String>) {

    /*** While loop ***/
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }

    /*** For loop ***/
    val people = ArrayList<KotlinPerson>()
    people.add(KotlinPerson(1, "Mr", "James", "Apple"))
    people.add(KotlinPerson(2, "Miss", "Sophie", "Orange"))
    people.add(KotlinPerson(3, "Mrs", "Anita", "Kumwat"))
    people.add(KotlinPerson(4, "Mr", "Darren", "Banana"))
    /*** Destructuring in for loop ***/
    for ((id, title, firstName) in people) {
        /*** Destructuring in for loop ***/
        println("$title $firstName has id $id")
    }

    /*** For loop with Range object ***/
    val myRange = 0..9
    for (i in myRange) {
        println(i)
    }
    println("Inline forEach")
    (0..9).forEach{ println(it) }
    println("Down to")
    (9 downTo 0).forEach { println(it) }
    println("Until")
    (0 until 9).forEach { println(it) }
    println("Step")
    (0..9 step 2).forEach { println(it) }
    println("Loop letters")
    ('A'..'F').forEach { println(it) }
}
