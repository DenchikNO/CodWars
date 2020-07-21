package com.exp.codwars.person;

import java.util.HashMap;
import java.util.Map;

public class SplitAll {
    public Map<String, String> splitAll(String contact) {
        Map<String, String> map = new HashMap<>();
        String[] strSplit = contact.split("\n");

        for (String s : strSplit) {
            String[] strSplitMore = s.split(";");
            map.put(strSplitMore[0], strSplitMore[1]);
        }
        return map;
    }
}
