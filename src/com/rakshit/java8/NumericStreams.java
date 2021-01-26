package com.rakshit.java8;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
* 1. sum()
* 2. count()
* 3. max()
* 4. min()
* */
public class NumericStreams {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,6)
                .sum();
        System.out.println(sum);


        long count = IntStream.rangeClosed(1,10)
                .count();
        System.out.println(count);

        IntStream.rangeClosed(1,10).forEach(System.out::println);


        OptionalInt maxValue = IntStream.rangeClosed(1,10).max();

        System.out.println(maxValue.isPresent() ? maxValue.getAsInt() : 10000);

    }
}
