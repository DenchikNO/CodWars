package com.exp.codwars.person;

import java.util.List;
import static com.exp.codwars.person.ContactTypeParsing.a;

public class Main {
    public static void main(String[] args) {

        String str = "Boris;1;26\nDenis;1;21";
        PersonParsing personParsing = new PersonParsing();
        List<Person> list = personParsing.parse(str);

        a("Boris;+375333344546\nDenis;+375291178425",
                ContactType.PHONE,
                list);
        ContactTypeParsing.a("Boris;https://vk.com/boris.lutovich\nDenis;https://vk.com/denchik_no",
                ContactType.SITE,
                list);
        ContactTypeParsing.a("Boris;https://www.instagram.com/boris.lutovich\nDenis;https://www.instagram.com/den4ik_no",
                ContactType.INSTAGRAM,
                list);
    }
}
