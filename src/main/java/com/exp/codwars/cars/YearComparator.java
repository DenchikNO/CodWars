package com.exp.codwars.cars;

import java.util.Comparator;

public class YearComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
//        return -Integer.compare(o1,o2);
    }
}
