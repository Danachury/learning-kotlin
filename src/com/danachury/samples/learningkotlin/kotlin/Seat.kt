package com.danachury.samples.learningkotlin.kotlin

data class Seat(val row: Int, val num: Int, val price: Double, val description: String) {

    override fun toString() =
        "Seat $row-$num $$price ($description)"
}
