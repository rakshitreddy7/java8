package com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDB {
    public static List<Student> getStudents() {

        Student student1 = new Student("Reddy", 111, 3.5, Arrays.asList("Swimming","Coding","Watching"));
        Student student2 = new Student("Rakshit", 222, 3.2, Arrays.asList("Singing","Dancing","Watching"));
        Student student3 = new Student("Aman", 333, 3.8, Arrays.asList("Coding","Biking"));
        Student student4 = new Student("Lukasz", 444, 4.0, Collections.singletonList("Biking"));

        return Arrays.asList(student1, student2, student3, student4);
    }
}
