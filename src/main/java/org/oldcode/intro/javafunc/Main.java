package org.oldcode.intro.javafunc;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("java functional ...");
    }
    static boolean isPrime(int num) {
        //Predicate<Integer> isDiv =  divisor -> num % divisor == 0;
        Predicate<Integer> isDiv =  divisor -> num % divisor == 0;
        return num > 1 &&
                IntStream.range(2, num)
                         .noneMatch(index -> num % index == 0);
    }
}
