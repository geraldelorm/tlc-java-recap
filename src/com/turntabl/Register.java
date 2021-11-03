package com.turntabl;

import com.turntabl.Enums.Year;
import com.turntabl.Expections.StudentNotFoundException;
import com.turntabl.Interfaces.Nameable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {
    private List<Student> studentsRegister = new ArrayList<>();

    public Register(List<Student> nameables) {
        this.studentsRegister = nameables;
    }

    public List<String> getRegister(){

        List<String> nameOfStudents = studentsRegister.stream().map(n -> n.getName()).collect(Collectors.toList());
        return nameOfStudents;
    }

    public List<String> getRegisterByYear(Year year){
        return studentsRegister.stream()
                .filter(s -> s.getYear() == year)
                .map(s -> s.getName())
                .collect(Collectors.toList());
    }

    //print report
    public void printReport() {

    }


    public Optional<Student> getRegisterByName(String name ){
        return  studentsRegister.stream().filter(s -> s.getName() == name).findFirst();
    }

    public Double getHighestGradeOfAllStudents(){
        return studentsRegister.stream().flatMap(s -> s.getGradesStream()).max(Double::compare).get();
    }


    public Double averageOfAllStudentGrades(){
//        Double sum = studentsRegister.stream().flatMap(student -> student.getGradesStream()).reduce(0.0, (a,b) -> a + b);
//        int size = studentsRegister.stream().flatMap(student -> student.getGradesStream()).collect(Collectors.toList()).size();
//        avg = sum/size
//        studentsRegister.stream().flatMapToDouble(std -> (DoubleStream) std.getGradesStream()).average().getAsDouble();

        return  studentsRegister.stream()
                .map(std -> std.getGradesStream()
                        .mapToDouble(c->c).average())
                .mapToDouble(OptionalDouble::getAsDouble)
                .average().getAsDouble();
    }

    public List<Student> getStudentsByName(List<String> listOfNames) {
        return studentsRegister.stream().filter(s -> listOfNames.contains(s.getName())).collect(Collectors.toList());
    }

    public List<Double> getAvgOfAllStudents() {
        return  studentsRegister.stream().map(s -> s.getAverageGrade()).collect(Collectors.toList());
    }

    public List<Double> gradesOfStudentsScoringAbove60() {
        return studentsRegister.stream().map(s -> s.getAverageGrade()).filter(s -> s > 60.0).collect(Collectors.toList());
    }

}