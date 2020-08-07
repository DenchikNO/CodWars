package com.exp.codwars.site.warden;

import java.util.HashMap;
import java.util.Map;

public class Site {
    private Map<String, Integer> map;

    public Site() {
        super();
        map = new HashMap<>();
        map.put("https://www.voka.tv/ufc", 15);
        map.put("https://yohoho.cc/", 18);
        map.put("http://nnmclub.to/", 10);
        map.put("https://music.yandex.ru/", null);
        map.put("https://www.instagram.com/", null);
    }

    public void takeAverage() {
        double a = 0;
        int b = map.size();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                b--;
            } else {
                a += entry.getValue();
            }
        }

        if (b != 0) {
            double c = a / b;
            System.out.println(c);
        } else {
            System.out.println("Map is empty");
        }
    }
}
