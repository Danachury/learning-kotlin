package com.danachury.samples.learningkotlin.kotlin

fun main(args: Array<String>) {
    val theater = Theater()

    fun printBestViewRow(row: Int) {
        theater.seats
            .filter { it.row == row && it.description == View.BEST_VIEW.description }
            .forEach {
                print("\u001B[32m ${it.row}-${it.num} ")
            }
    }

    fun printStandardViewRow(row: Int) =
        theater.seats
            .filter { it.row == row && it.description == View.STANDARD_VIEW.description }
            .forEach {
                print("\u001B[34m ${it.row}-${it.num} ")
            }

    theater.seats
        .filter { it.description == View.RESTRICTED_VIEW.description }
        .forEach { seat ->
            if (seat.num == 1)
                println("\u001B[0m")
            (1..3)
                .forEach { print("\u001B[31m ${seat.row}-$it ") }
            printBestViewRow(seat.row)
            printStandardViewRow(seat.row)
            (34..36)
                .forEach { print("\u001B[31m ${seat.row}-$it ") }
        }

    theater.seats
        .filter { it.description == View.CHEAPER_SEAT.description }
        .forEach {
            if (it.num == 1)
                println("\u001B[0m")
            print("\u001B[35m ${it.row}-${it.num} ")
        }

    theater.seats
        .filter { it.description == View.BACK_ROW.description }
        .forEach {
            if (it.num == 1)
                println("\u001B[0m")
            print("\u001B[33m ${it.row}-${it.num} ")
        }
}
