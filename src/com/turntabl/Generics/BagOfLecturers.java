package com.turntabl.Generics;

import com.turntabl.Lecturer;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers {
    List<Lecturer> lecturers = new ArrayList<>();

    public void add(Lecturer lecturer) {
        lecturers.add(lecturer);
    }
    public void remove(Lecturer lecturer) {
        lecturers.remove(lecturer);
    }
    public void clear(){
        lecturers.clear();
    }

}
