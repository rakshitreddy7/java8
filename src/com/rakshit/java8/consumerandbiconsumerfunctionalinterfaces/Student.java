package com.rakshit.java8.consumerandbiconsumerfunctionalinterfaces;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@ToString
public class Student {
    public String name;
    public Integer id;
    public Double gpa;
    public List<String> actvities;
}
