package com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces;

/*
* 1. Has only 1 abstract method SAM, called "accept()"
* 2. Has another function called "andThen()". This is a default method.
*
* */

import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        List<Student> students = StudentDB.getStudents();

        Consumer<Student> consumer1 = s -> System.out.println(s.getName());
        Consumer<Student> consumer2 = s -> System.out.println(s.getActvities());

        Consumer<Student> combinedConsumer = consumer1.andThen(consumer2);

        students.forEach(student -> combinedConsumer.accept(student));

    }
}
