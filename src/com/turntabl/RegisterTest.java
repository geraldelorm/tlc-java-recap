package com.turntabl;

import com.turntabl.Enums.Year;
import com.turntabl.Interfaces.Nameable;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest {
    @Test
    public void registerTest() {
        List<Student> studentList = List.of(
                new Student("Gerald", "001", Year.FIRST, List.of(2.0, 2.0, 2.0)),
                new NaughtyStudent("Alex", "002", Year.SECOND, List.of(2.0, 2.0, 2.0))
        );
        Register register = new Register(studentList);

        assertEquals(register.getRegister(), studentList.stream().map(s -> s.getName()).collect(Collectors.toList()));
    }
}
