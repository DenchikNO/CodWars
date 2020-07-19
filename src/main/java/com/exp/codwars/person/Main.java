package com.exp.codwars.person;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = "Boris;1;26\nDenis;1;21";
        PersonParsing personParsing = new PersonParsing();
        List<Person> list = personParsing.parse(str);

        String phone = "Boris;+375333344546\nDenis;+375291178425";
        PhoneParsing phoneParsing = new PhoneParsing();
        Map<String, String> map = phoneParsing.phoneParse(phone);

        for (Person person : list) {
//            if (map.containsKey(person.getName())) {
            String a = map.get(person.getName());
            if (a != null) {
//                String a = map.get(person.getName());
                person.getMap().put(ContactType.PHONE, a);
            }
//            }
        }
    }
}
