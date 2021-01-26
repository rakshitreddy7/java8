package com.rakshit.java8;

import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.Student;
import com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces.StudentDB;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
*
* 1. joining()
* 2. mapping()
* 3. counting()
* 4. minBy() & maxBy()
* 5. sum()
* 6. avg()
* 7. groupingBy()
* 8. partitioningBy()
*
* */
public class TerminalOps {

    private List<Student> getAllStudents() {
        return StudentDB.getStudents();
    }

    public static void main(String[] args) {
        TerminalOps ops = new TerminalOps();

        System.out.println(ops.joining());
        System.out.println(ops.counting());
        System.out.println(ops.mapping());
        System.out.println(ops.sum());
        System.out.println(ops.avg());
        System.out.println(ops.grouping());
        System.out.println(ops.groupingByCustomText());
        System.out.println(ops.partitioning());
    }

    private String joining() {
        List<Student> students = getAllStudents();

        Predicate<Student> predicate = s -> s.getActvities().size() > 1;

        return students.stream()
                .filter(predicate)
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    private long counting() {
        List<Student> students = getAllStudents();
        Predicate<Student> predicate = s -> s.getGpa() > 3.5;

        return students.stream()
                .filter(predicate)
                .collect(Collectors.counting());
    }

    private List<Double> mapping() {
        List<Student> students = getAllStudents();

        return students.stream()
                .collect(Collectors.mapping(Student::getGpa, Collectors.toList()));
    }

    private Double sum() {
        List<Student> students = getAllStudents();

        return students.stream()
                .collect(Collectors.summingDouble(Student::getGpa));
    }

    private Double avg() {
        List<Student> students = getAllStudents();

        return students.stream()
                .collect(Collectors.averagingDouble(Student::getGpa));
    }

    private Map<String,List<Student>> grouping() {
        List<Student> students = getAllStudents();

        return students.stream()
                .collect(Collectors.groupingBy(Student::getName));
    }

    private Map<String,List<Student>> groupingByCustomText() {
        List<Student> students = getAllStudents();

        return students.stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() > 3.5 ? "GOOD" : "AVG"));
    }

    private Map<Boolean,List<Student>> partitioning() {
        List<Student> students = getAllStudents();

        Predicate<Student> gpaPredicate = s -> s.getGpa() > 3.5;

        return students.stream()
                .collect(Collectors.partitioningBy(gpaPredicate,Collectors.toList()));
    }
}
