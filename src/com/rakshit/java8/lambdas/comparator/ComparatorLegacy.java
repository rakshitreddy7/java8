package com.rakshit.java8.lambdas.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ComparatorImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b.compareTo(a);
    }
}
public class ComparatorLegacy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,4,1,5,7,0,3);
        Comparator<Integer> comparator = new ComparatorImpl();
        list.sort(comparator);
        System.out.println(list);
    }
}
