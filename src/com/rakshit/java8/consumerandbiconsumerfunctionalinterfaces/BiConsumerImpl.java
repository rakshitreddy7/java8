package com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
        List<Student> students = StudentDB.getStudents();

        BiConsumer<Integer,String> biConsumer1 = (a,b) -> System.out.println("Id = " + a + " Name = " + b);
        BiConsumer<String,List<String>> biConsumer2 = (b,c) -> System.out.println("Name = " + b + " Activities = " + c);
        BiConsumer<Integer,String> biConsumer3 = (a,b) -> System.out.println("Id = " + a + " NAME = " + b.toUpperCase());

        students.forEach(student -> {
            biConsumer1.accept(student.id, student.name);
        });

        students.forEach(student -> {
            biConsumer2.accept(student.name, student.actvities);
        });

        System.out.println("------------------------------");

        BiConsumer<Integer,String> combinedBiConsumer = biConsumer1.andThen(biConsumer3);
        students.forEach(student -> {
            combinedBiConsumer.accept(student.id,student.getName());
        });


    }
}
