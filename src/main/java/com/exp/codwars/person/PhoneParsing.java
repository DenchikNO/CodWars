package com.exp.codwars.person;

import java.util.Map;

public class PhoneParsing extends SplitAll {
    Map<String, String> phoneParse(String phone) {
        return super.splitAll(phone);

//        Map<String, String> map = new HashMap<>();
//        String[] strSplit = phone.split("\n");
//
//        for (String s : strSplit) {
//            String[] strSplitMore = s.split(";");
//            map.put(strSplitMore[0], strSplitMore[1]);
//        }
//        return map;
    }
}