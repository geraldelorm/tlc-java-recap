package com.turntabl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    private List<Student> studentList = new ArrayList<>();

    public void enter(Student student){
        studentList.add(student);
    }

    public Double getHighestAverageGrade() {
        List<Double> averages = new ArrayList<>();
        for(Student student: studentList){
            averages.add(student.getAverageGrade());
        }
        return Collections.max(averages);
    }
}
