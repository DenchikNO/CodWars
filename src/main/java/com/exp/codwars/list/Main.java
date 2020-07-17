package com.exp.codwars.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestList testList = new TestList(1000, new LinkedList<>());
        testList.takeElementsInList();
        testList.findRandomElement();
    }
}
