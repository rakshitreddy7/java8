package com.rakshit.java8.functionandbifunctionalfunctionalinterface;

import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.Student;
import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.StudentDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionImplStudents {
    public static void main(String[] args) {
        List<Student> students = StudentDB.getStudents();

        Function<List<Student>, Map<String,Double>>  function = studentList -> {
            Map<String,Double> map = new HashMap<>();

            studentList.forEach(student -> {
                map.put(student.getName(),student.getGpa());
            });

            return map;
        };

        Map<String,Double> map = function.apply(students);

        System.out.println(map);
    }
}
