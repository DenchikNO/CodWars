package com.exp.codwars.vowel.count;

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
