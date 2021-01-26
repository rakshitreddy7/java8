package com.rakshit.java8.predicateandbipredicatefunctionalinterface;

import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.Student;
import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.StudentDB;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateImpl {
    public static void main(String[] args) {
        List<Student> students = StudentDB.getStudents();

        BiPredicate<Double,List<String>> biPredicate = (gpa,activities) -> gpa < 3.5 && activities.size() > 1;

        List<Student> list = students.stream().filter(student -> biPredicate.test(student.getGpa(),student.getActvities()))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
