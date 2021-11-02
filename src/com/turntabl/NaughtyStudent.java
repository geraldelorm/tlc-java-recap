package com.turntabl;

import com.turntabl.Enums.Year;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(String name, String studentID, Year year, List<Double> grades) {
        super(name, studentID, year, grades);
    }

    @Override
    public double getAverageGrade() {
        Double avg = super.getAverageGrade();
        Double cheat = avg * 0.1;

        return avg + cheat;
    }
}
