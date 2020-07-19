package com.exp.codwars.sitewarden;

import java.util.HashMap;
import java.util.Map;

public class Site {
    private Map<String, Integer> map = new HashMap<>();

    {
        map.put("https://www.voka.tv/ufc", 15);
        map.put("https://yohoho.cc/", 18);
        map.put("http://nnmclub.to/", 10);
        map.put("https://music.yandex.ru/", 12);
        map.put("https://www.instagram.com/", 13);
    }

    public void takeAverage() {
        double a = 0;
        int b = map.size();

        for (String key : map.keySet()) {
            a += map.get(key);
        }

        if (b != 0) {
            double c = a / b;
            System.out.println(c);
        } else {
            System.out.println("Map is empty");
        }
    }
}
