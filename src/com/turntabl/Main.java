package com.turntabl;

import com.turntabl.Enums.Year;
import com.turntabl.Generics.Bag;

import java.util.ArrayList;
import java.util.List;

import static com.turntabl.Enums.Year.*;

public class Main {

    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>(List.of(
//                new Student("Gerald", "001", FIRST),
//                new Student("Alex", "002", SECOND),
//                new Student("Afi", "003", THIRD),
//                new Student("Abena", "004", FOURTH),
//                new Student("Peter", "005", FIRST),
//                new Student("Love", "006", SECOND),
//                new Student("Mary", "007", THIRD),
//                new Student("Jane", "008", FOURTH),
//                new Student("Kojo", "009", FIRST),
//                new Student("Elorm", "010", THIRD),
//                new Student("Dave", "011", FOURTH)
//        ));
//
//        List<Student> firstYears = students.stream().filter(s -> s.getYear() == FIRST).collect(Collectors.toList());
//        List<Student> secondYears = students.stream().filter(s -> s.getYear() == SECOND).collect(Collectors.toList());
//        List<Student> thirdYears = students.stream().filter(s -> s.getYear() == THIRD).collect(Collectors.toList());
//        List<Student> fourthYears = students.stream().filter(s -> s.getYear() == FOURTH).collect(Collectors.toList());
//
//        Course introToProgramming = new Course(firstYears, FIRST);
//
//        List<Student> thirdAndFourthYears = students.stream().filter(s -> s.getYear() == FOURTH || s.getYear() ==  THIRD).collect(Collectors.toList());
//
//        Course advancedGardening = new Course( thirdAndFourthYears, FOURTH);
//
//        String vowels = "aeiou";
//
//        List<Student> fourthYearWithVowel = students.stream()
//                .filter(s -> s.getYear() == FOURTH)
//                .filter(s -> vowels.contains(s.getName().charAt(0))) // use the vowel here
//                .collect(Collectors.toList());
//        Course physics = new Course( fourthYearWithVowel, FOURTH);
//
//        System.out.println(physics.getStudentsTakingCourse());
//
//
//




//        List<Double> grades = List.of(5.0, 10.0, 1.0);
//
//        Student student = new Student("Gerald", "001", Year.FIRST,grades);
//        Student naughtyStudent = new NaughtyStudent("Afi", "003", Year.THIRD, grades);
//
//        System.out.println(student.getAverageGrade());
//        System.out.println(naughtyStudent.getAverageGrade());
//
//        Lecture lecture = new Lecture();
//        lecture.enter(student);
//        lecture.enter(naughtyStudent);
//
//        System.out.println(lecture.getHighestAverageGrade());
//
//
//
//        Bag<Student> studentsBag = new Bag<>();
//        studentsBag.add(student);
//        studentsBag.add(naughtyStudent);
//        System.out.println("Two Added");
//        studentsBag.getBag().stream().forEach(System.out::println);
//
//
//        System.out.println("One removed");
//        studentsBag.remove(student);
//        studentsBag.getBag().stream().forEach(System.out::println);
//
//        System.out.println("all cleared");
//        studentsBag.clear();
//        studentsBag.getBag().stream().forEach(System.out::println);
//




    }
}
