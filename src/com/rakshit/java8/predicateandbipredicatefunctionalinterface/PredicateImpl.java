package com.rakshit.java8.predicateandbipredicatefunctionalinterface;

import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.Student;
import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.StudentDB;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateImpl {
    public static void main(String[] args) {
        List<Student> students = StudentDB.getStudents();

        Predicate<Student> predicate1 = student -> student.getGpa() >= 3.5;
        Predicate<Student> predicate2 = student -> student.getActvities().size() > 1;

        Predicate<Student> studentPredicate = predicate1.and(predicate2);

        List<Student> list = students.stream()
                .filter(studentPredicate)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
