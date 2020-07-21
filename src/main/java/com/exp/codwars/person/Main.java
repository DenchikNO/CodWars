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
            String a = map.get(person.getName());
            if (a != null) {
                person.getMap().put(ContactType.PHONE, a);
            }
        }

        String site = "Boris;https://vk.com/boris.lutovich\nDenis;https://vk.com/denchik_no";
        SiteParsing siteParsing = new SiteParsing();
        Map<String, String> mapSite = siteParsing.siteParse(site);

        for (Person person : list) {
            String a = mapSite.get(person.getName());
            if (a != null) {
                person.getMap().put(ContactType.SITE, a);
            }
        }
    }
}
