package com.exp.codwars.vowelcount;

import java.util.HashSet;
import java.util.Set;

public class VowelsSet implements VowelsCounter {

    private static Set<Character> VOWELS = new HashSet<>(5);

    static {
        VOWELS.add('a');
        VOWELS.add('e');
        VOWELS.add('i');
        VOWELS.add('o');
        VOWELS.add('u');
    }

    public VowelsSet() {
        super();
    }

    @Override
    public int getCount(String str) {
        int count = 0;

        for (char c : str.toLowerCase()
                         .toCharArray()) {
            //count += vowels.contains(c) ? 1 : 0;

            if (VOWELS.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
