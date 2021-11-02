package com.turntabl.Generics;

import java.util.ArrayList;
import java.util.List;

public class Bag<E> {
    List<E> bag = new ArrayList<>();


    public void add(E e) {
        bag.add(e);
    }
    public void remove(E e) {
        bag.remove(e);
    }
    public void clear(){
        bag.clear();
    }

    public List<E> getBag() {
        return bag;
    }
}
