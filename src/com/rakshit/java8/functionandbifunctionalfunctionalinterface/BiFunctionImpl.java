package com.rakshit.java8.functionandbifunctionalfunctionalinterface;

import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.Student;
import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.StudentDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionImpl {
    public static void main(String[] args) {
        List<Student> studentList = StudentDB.getStudents();

        Predicate<Student> predicate = s -> s.getActvities().size() > 1;

        BiFunction<List<Student>, Predicate<Student>, Map<Integer,String>> biFunction = (studentList1, studentPredicate) -> {
            Map<Integer,String> map = new HashMap<>();

            studentList1.stream().filter(s -> studentPredicate.test(s))
                    .forEach(student -> {
                        map.put(student.getId(), student.getName());
                    });

            return map;
        };

        Map<Integer,String> map = biFunction.apply(studentList, predicate);

        System.out.println(map);
    }
}
