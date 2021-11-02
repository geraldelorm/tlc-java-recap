package com.turntabl;

import com.turntabl.Enums.Year;
import com.turntabl.Interfaces.Nameable;

import java.util.List;

public class Student implements Nameable {
    private String name;
    private String studentID;
    private Year year;
    private List<Double> grades;


    public Student(String name, String studentID, Year year, List<Double> grades) {
        this.name = name;
        this.studentID = studentID;
        this.year = year;
        this.grades = grades;
    }

    public double getAverageGrade() {
        Double total = grades.stream().reduce(0.0, (a, b) -> a +b );
        int length = grades.size();

        Double avg = total/length;
        return avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", year=" + year +
                ", grades=" + grades +
                '}';
    }
}
