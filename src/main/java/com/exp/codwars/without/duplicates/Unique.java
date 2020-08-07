package com.exp.codwars.without.duplicates;

import java.util.*;

public class Unique {

    public void uniqueString() {
        Collection<String> set = new HashSet<>(initialize());
        System.out.println(set);
    }

    public List<String> initialize(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Den");
        arrayList.add("Den");
        arrayList.add("Ben");
        arrayList.add("Sam");
        arrayList.add("Sam");
        arrayList.add("John");
        return arrayList;
    }
}
