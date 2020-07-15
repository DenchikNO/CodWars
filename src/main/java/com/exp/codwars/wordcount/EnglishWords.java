package com.exp.codwars.wordcount;

import java.util.HashMap;
import java.util.Map;

public class EnglishWords {

    private Map<Character, Integer> map = new HashMap<>();

    public EnglishWords() {
        super();
    }

    public void takeCharParagraph(char[] charParagraph) {
        for (char c : charParagraph) {
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("letter: " + entry.getKey() + " number of: " + entry.getValue() + "\n");
        }
    }

    public void takeCharParagraph(String paragraph) {
        char[] charParagraph = paragraph
                .toLowerCase()
                .toCharArray();
        takeCharParagraph(charParagraph);
    }
}
