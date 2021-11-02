package com.turntabl;

import com.turntabl.Enums.Year;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NaughtyStudentTest {
    @Test
    public void testNaughtyStudentsScoreMore() {
        Lecture lecture = new Lecture();

        Student student = new Student("Gerald", "001", Year.FIRST, List.of(2.0, 2.0, 2.0));
        Student naughty = new NaughtyStudent("Alex", "002", Year.SECOND, List.of(2.0, 2.0, 2.0));

        lecture.enter(student);
        lecture.enter(naughty);

        assertEquals(lecture.getHighestAverageGrade(), naughty.getAverageGrade());
    }

}