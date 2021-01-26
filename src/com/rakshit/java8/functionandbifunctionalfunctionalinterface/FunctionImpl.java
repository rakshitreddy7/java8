package com.rakshit.java8.functionandbifunctionalfunctionalinterface;

import java.util.function.Function;

public class FunctionImpl {
    public static void main(String[] args) {
        Function<String,String> function1 = s1 -> s1.concat(" world");
        Function<String,String> function2 = s -> s.toUpperCase();

        Function<String,String> function = function1.andThen(function2);

        System.out.println(function1.apply("hello"));
        System.out.println(function.apply("hello"));

        System.out.println(function.apply("---------------"));

        Function<String,String> composeFunc = function1.compose(function2);

        System.out.println(composeFunc.apply("hello"));
    }
}
