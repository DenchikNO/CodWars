package com.exp.codwars.vowelcount;

import java.util.HashSet;
import java.util.Set;

public class Vowels implements VowelsCounter {

    public Vowels() {
        super();
    }

    @Override
    public int getCount(String str) {

        char[] charLetters = str
                .toLowerCase()
                .toCharArray();

        int count = 0;

        for (char c : charLetters) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }

        }
        return count;
    }
}
