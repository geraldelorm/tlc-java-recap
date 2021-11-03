package com.turntabl;

import com.turntabl.Enums.Year;
import com.turntabl.Interfaces.Nameable;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RegisterTest {
    @Test
    public void registerTest() {
        List<Student> studentList = List.of(
                new Student("Gerald", "001", Year.FIRST, List.of(2.1, 1.9, 2.0)),
                new NaughtyStudent("Alex", "002", Year.SECOND, List.of(2.0, 2.0, 2.0))
        );
        Register register = new Register(studentList);

        //test getRegister
        assertEquals(List.of("Gerald", "Alex"),register.getRegister());

        //test getRegisterByYear
        assertEquals(List.of("Gerald"), register.getRegisterByYear(Year.FIRST));

        //test getStudentByName using optionals
        assertEquals(Optional.of(studentList.get(0)), register.getRegisterByName("Gerald"));
        assertEquals(Optional.empty(),  register.getRegisterByName("Max"));

        //test getHighestGradeOfAllStudents
        assertEquals(2.1, register.getHighestGradeOfAllStudents());

        //test getStudentsByName
        assertEquals( studentList,register.getStudentsByName(List.of("Gerald", "Alex")));
        assertEquals( List.of(studentList.get(1)),register.getStudentsByName(List.of("Alex")));

        //test averageOfAllStudentGrades
        assertEquals(2.0, register.averageOfAllStudentGrades());

        //test studentsScoringAbove60
        assertEquals(List.of(2.0, 2.2), register.getAvgOfAllStudents());

        //test gradesOfStudentsScoringAbove60
        assertEquals(List.of(), register.gradesOfStudentsScoringAbove60());

    }
}
