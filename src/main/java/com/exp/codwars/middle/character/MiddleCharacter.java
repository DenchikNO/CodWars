package com.exp.codwars.middle.character;

public class MiddleCharacter {
    public String getMiddle(String word) {
        char[] charWord = word.toCharArray();
        int middleCharWord = charWord.length / 2;

        return (charWord.length % 2 != 0) ?
                String.valueOf(charWord[middleCharWord]) :
                (charWord[middleCharWord - 1]) + String.valueOf(charWord[middleCharWord]);
    }
}
