package com.rakshit.java8.supplierfunctionalinterface;

import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierImpl {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "hello world";
        System.out.println(stringSupplier.get());

        Supplier<Student> studentSupplier = () -> Student.builder()
                .id(233)
                .name("JackMa")
                .actvities(Arrays.asList("hockey"))
                .gpa(4.0)
                .build();

        System.out.println(studentSupplier.get());
    }
}
