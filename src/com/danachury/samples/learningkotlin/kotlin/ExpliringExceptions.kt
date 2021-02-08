package com.danachury.samples.learningkotlin.kotlin

import java.io.FileInputStream

@Throws(InterruptedException::class)
private fun divide(a: Int, b: Int): Double {
    Thread.sleep(1000)
    return a.toDouble() / b
}

private fun printFile() {
    val input = FileInputStream("file.txt")

    // Here The document is closed automatically
    input.use {
        // An Exception could be thrown here
    }
}

fun main(args: Array<String>) {

    println(divide(23, 5))

    /*** Handling Exception ***/
    val result = try {
        divide(27, 0)
    } catch (e: Exception) {
        println(e)
        0
    }
    println(result)
}
