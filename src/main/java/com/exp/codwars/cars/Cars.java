package com.exp.codwars.cars;

import java.util.*;

public class Cars {
    private List<String> listMark = new ArrayList<>();
    private Collection<String> listCarOne = new ArrayList<>();
    private Collection<String> listCarTwo = new ArrayList<>();
    private Map<String, List<String>> map = new HashMap<>();

    {
        listMark.add("Audi");
        listMark.add("BMW");
    }

    {
        listCarOne.add("Audi RS6 Avant by ABT (C8) '2020 10");
        listCarOne.add("Audi Q7 55 TFSI e Quattro S-Line (4M) (UK) '2020 40");
        listCarOne.add("Audi A7 Sportback 55 TFSI e Quattro S-Line (UK) '2020 40");
        listCarOne.add("Audi RS7 Sportback (AU) '2020 3");
        listCarOne.add("Audi RS6 Avant (AU) '2020 3");
    }

    {
        listCarTwo.add("BMW M5 30 Jahre (F10) '2015 12");
        listCarTwo.add("BMW M5 30 Jahre (F10) '2015 60");
        listCarTwo.add("BMW 2002 tii by Alpina (E10) '1973 - 74 12");
        listCarTwo.add("BMW X7 M50i (G07) (JP) '2019 18");
        listCarTwo.add("BMW iX3 (G08) (WW) '2020 87");
    }

    public void makeGroup(){
            map.put(listMark.get(0), (List<String>) listCarOne);
            map.put(listMark.get(1), (List<String>) listCarTwo);
    }
}
