package com.danachury.samples.learningkotlin.java;

import java.math.BigDecimal;
import java.util.Random;

public class BoringJavaCode {

    public static void main(String[] args) {
        var name = "Denilson";
        var typeOfObject = name instanceof Object;
        System.out.println(typeOfObject);
        System.out.println(name);

        // See Kotlin Code {@link ExploringCasting}
        Object result;
        Integer randomNumber = new Random().nextInt(3);

        if (randomNumber == 1) {
            result = new BigDecimal(30);
        } else
            result = "hello";

        System.out.println("Result is currently " + result);

        if (result instanceof BigDecimal)
            // add() 47
            result = ((BigDecimal) result).add(new BigDecimal(47));
        else
            // toUppercase()
            result = ((String) result).toUpperCase();

        System.out.println("Result is currently " + result);
    }
}
