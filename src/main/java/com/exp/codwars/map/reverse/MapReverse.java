package com.exp.codwars.map.reverse;

import java.util.HashMap;
import java.util.Map;

public class MapReverse {

    public static Map<Integer, String> invert(Map<String, Integer> map) {

        Map<Integer, String> inv = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            inv.put(entry.getValue(), entry.getKey());
        }
        return inv;
    }
}
