package com.exp.codwars.person;

import org.springframework.beans.factory.support.ManagedArray;
import org.springframework.cglib.core.MethodWrapper;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Boris;1;26\nDenis;1;21";

        List<Person> personList = new ArrayList<>();

        String[] strTwo = str.split("\n");

        for(String person : strTwo){
            Person person1 = new Person();
            personList.add(person1);

            String[] str3 = person.split(";");

            person1.setName(str3[0]);

            if (str3[1].equals("1")){
                person1.setSex(SexType.MALE);
            } else {
                person1.setSex(SexType.FEMALE);
            }

            person1.setAge(Integer.parseInt(str3[2]));

        }
    }
}
