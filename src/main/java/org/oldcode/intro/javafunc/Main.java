package org.oldcode.intro.javafunc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Predicate<Integer> isDiv =  divisor -> num % divisor == 0;
        
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                values.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .findFirst()
//                        .get()
        );
    }
}
