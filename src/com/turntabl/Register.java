package com.turntabl;

import com.turntabl.Interfaces.Nameable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Student> studentsRegister = new ArrayList<>();

    public Register(List<Student> nameables) {
        this.studentsRegister = nameables;
    }

    public List<String> getRegister(){

        List<String> nameOfStudents = studentsRegister.stream().map(n -> n.getName()).collect(Collectors.toList());
        return nameOfStudents;
    }
}