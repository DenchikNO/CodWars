package com.exp.codwars.person;

import java.util.List;
import java.util.Map;

public class ContactTypeParsing extends SplitAll {
    public void contactParsing(List<Person> list, Map<String, String> map, ContactType contactType) {
        for (Person person : list) {
            String a = map.get(person.getName());
            if (a != null) {
                person.getMap().put(contactType, a);
            }
        }
    }
}
