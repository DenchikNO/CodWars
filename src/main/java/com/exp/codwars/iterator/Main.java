package com.exp.codwars.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 26, 5, 12, 7, 9, 12, 54};

        Iterator<Integer> iterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return array[4]==7;
            }

            @Override
            public Object next() {
                return array[0];
            }
        };
    }
}
