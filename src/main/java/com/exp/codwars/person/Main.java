package com.exp.codwars.person;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String str = "Boris;1;26\nDenis;1;21";

        List<Person> personList = new ArrayList<>();

        String[] strSplit = str.split("\n");

        for (String s : strSplit) {
            Person person = new Person();
            personList.add(person);

            String[] strSplitMore = s.split(";");

            person.setName(strSplitMore[0]);

            if (strSplitMore[1].equals("1")) {
                person.setSex(SexType.MALE);
            } else {
                person.setSex(SexType.FEMALE);
            }

            person.setAge(Integer.parseInt(strSplitMore[2]));

        }
    }
}
