package com.rakshit.java8.lambdas.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a,b) -> b.compareTo(a);

        List<Integer> list = Arrays.asList(1,4,2,18,3,9,12);
        list.sort(comparator);
        System.out.println(list);
    }
}
