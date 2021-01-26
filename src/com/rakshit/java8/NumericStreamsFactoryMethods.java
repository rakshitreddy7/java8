package com.rakshit.java8;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;


/*
*   1. Stream.iterate()
*   2. Stream.generate() -> takes Supplier
*   3. Stream.of()
* */

public class NumericStreamsFactoryMethods {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("Hello", "World", "Java");
        list.forEach(System.out::println);

        Stream.iterate(1, i->i*2)
                .limit(10)
                .forEach(System.out::println);


        Supplier<Integer> supplier = () -> new Random().nextInt();

        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
