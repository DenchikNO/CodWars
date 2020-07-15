package com.exp.codwars.vowelcount;

public class Main {
    public static void main(String[] args) {
        VowelsCounter vowels = true ? new Vowels() : new VowelsSet();
        System.out.println(vowels.getCount("aIU"));
    }
}
