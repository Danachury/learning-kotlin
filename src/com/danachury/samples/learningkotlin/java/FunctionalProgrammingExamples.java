package com.danachury.samples.learningkotlin.java;

import java.util.ArrayList;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class FunctionalProgrammingExamples {

    private static Function<String, String> toSentenceCase = x -> x.substring(0, 1).toUpperCase() + x.substring(1);

    private static <T> T applyFunction(T input, Function<T, T> fun) {
        return fun.apply(input);
    }

    public static void main(String[] args) {
        final var result = applyFunction("hello", toSentenceCase);
        System.out.println(result);

        final var colors = asList(
            "red",
            "green",
            "blue",
            "black"
        );

        final var uppercaseColors = new ArrayList<String>();
        for (String color : colors)
            uppercaseColors.add(color.toUpperCase());

        uppercaseColors.forEach(System.out::println);
    }
}
