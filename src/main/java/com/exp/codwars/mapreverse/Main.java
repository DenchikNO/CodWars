package com.exp.codwars.mapreverse;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Hello", 0);
        map.put("World!", 1);

        MapReverse mapReverse = new MapReverse();
        System.out.println(mapReverse.invert(map));
    }
}
