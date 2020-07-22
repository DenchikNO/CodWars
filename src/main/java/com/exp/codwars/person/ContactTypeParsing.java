package com.exp.codwars.person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactTypeParsing {
    public static void contactParsing(List<Person> list, Map<String, String> map, ContactType contactType) {
        for (Person person : list) {
            String a = map.get(person.getName());
            if (a != null) {
                person.getMap().put(contactType, a);
            }
        }
    }

    public static Map<String, String> splitAll(String contact) {
        Map<String, String> map = new HashMap<>();
        String[] strSplit = contact.split("\n");

        for (String s : strSplit) {
            String[] strSplitMore = s.split(";");
            map.put(strSplitMore[0], strSplitMore[1]);
        }
        return map;
    }

    public static void a(String b, ContactType contactType, List<Person> list) {
        Map<String, String> mapSite = ContactTypeParsing.splitAll(b);
        ContactTypeParsing.contactParsing(list, mapSite, contactType);
    }
}
