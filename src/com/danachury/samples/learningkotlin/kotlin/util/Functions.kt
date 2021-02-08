package com.danachury.samples.learningkotlin.kotlin.util

fun <T> apply(input: T, f: (T) -> T) =
    f(input)
