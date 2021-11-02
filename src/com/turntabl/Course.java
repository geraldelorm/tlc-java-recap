package com.turntabl;

import com.turntabl.Enums.Year;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Lecturer lecture;
    private List<Student> studentsTakingCourse = new ArrayList<>();
    private Year year;

    public Course(List<Student> studentsTakingCourse, Year year) {
        this.studentsTakingCourse = studentsTakingCourse;
        this.year = year;
    }

    public Lecturer getLecture() {
        return lecture;
    }

    public void setLecture(Lecturer lecture) {
        this.lecture = lecture;
    }

    public List<Student> getStudentsTakingCourse() {
        return studentsTakingCourse;
    }

    public void setStudentsTakingCourse(ArrayList<Student> studentsTakingCourse) {
        this.studentsTakingCourse = studentsTakingCourse;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
