package com.exp.codwars.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

    private int numberInArray;
    private List<Integer> list;

    public TestList(int numberInArray, List<Integer> list) {
        this.numberInArray = numberInArray;
        this.list = list;
    }

    public void takeElementsInList() {
//        while (list.size() <= numberInArray) {
//            int a = (int) (Math.random() * numberInArray);
//            list.add(a);
//        }
        for (int i = 0; i < numberInArray; i++) {
            int a = (int) (Math.random() * numberInArray);
            list.add(a);
        }
    }

    public void findRandomElement() {
        long startTime = System.currentTimeMillis();
        int a = (int) (Math.random() * numberInArray);
        int count = 0;
        while (count <= numberInArray) {
            list.get(a);
            count++;
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
