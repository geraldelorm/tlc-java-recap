package com.turntabl.Generics;

import com.turntabl.Student;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
    List<Student> studentList = new ArrayList<>();

    public void add(Student student) {
        studentList.add(student);
    }
    public void remove(Student student) {
        studentList.remove(student);
    }
    public void clear(){
        studentList.clear();
    }
}
