package com.exp.codwars.person;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ContactTypeParsing contactTypeParsing = new ContactTypeParsing();

        String str = "Boris;1;26\nDenis;1;21";
        PersonParsing personParsing = new PersonParsing();
        List<Person> list = personParsing.parse(str);

        String phone = "Boris;+375333344546\nDenis;+375291178425";
        Map<String, String> map = contactTypeParsing.splitAll(phone);
        ContactType phoneType = ContactType.PHONE;
        contactTypeParsing.contactParsing(list, map, phoneType);

        String site = "Boris;https://vk.com/boris.lutovich\nDenis;https://vk.com/denchik_no";
        Map<String, String> mapSite = contactTypeParsing.splitAll(site);
        ContactType siteType = ContactType.SITE;
        contactTypeParsing.contactParsing(list, mapSite, siteType);

        String instagram = "Boris;https://www.instagram.com/boris.lutovich\nDenis;https://www.instagram.com/den4ik_no";
        Map<String, String> mapInstagram = contactTypeParsing.splitAll(instagram);
        ContactType instagramType = ContactType.INSTAGRAM;
        contactTypeParsing.contactParsing(list, mapInstagram, instagramType);
    }
}
