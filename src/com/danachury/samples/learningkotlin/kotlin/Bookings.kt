package com.danachury.samples.learningkotlin.kotlin

import java.io.Closeable

interface BookingManager {

    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerId: Long): Boolean
    fun systemStatus() = "All Operations are Functional"
}

class UnauthorizedUserException : Throwable()

open class BasicBookingManager(authKey: String) : BookingManager {

    init {
        if (authKey != "12345")
            throw UnauthorizedUserException()
    }

    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerId: Long) = false

}

class AdvancedBookingManager : BasicBookingManager("12345"), Closeable {

    override val version = "2.0"

    fun howManyBookings() = 10

    override fun close() {}
}

/*** Adding Extension functions ***/
fun String.toSentenceCase(): String =
    this[0].toUpperCase() + this.substring(1)

fun main(args: Array<String>) {
    println(AdvancedBookingManager().isSeatFree(Seat(1, 1, 0.0, "")))

    val greeting = "welcome to the system"
    println(greeting.toSentenceCase())
}
