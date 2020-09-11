package com.exp.codwars.str.without.letter;

public class Main {

    public static void main(String[] args) {
        System.out.println(remove("country"));
    }

    public static String remove(String str) {
        return (str == null || str.length() == 0) ? null : (str.substring(1, str.length() - 1));
    }
}


