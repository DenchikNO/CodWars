package com.exp.codwars.person;

import java.util.HashMap;
import java.util.Map;

public class PhoneParsing {

    Map<String, String> phoneParse(String phone) {

        Map<String, String> map = new HashMap<>();
        String[] strSplit = phone.split("\n");

        for (String s : strSplit) {
            String[] strSplitMore = s.split(";");
            map.put(strSplitMore[0], strSplitMore[1]);
        }
        return map;
    }
}