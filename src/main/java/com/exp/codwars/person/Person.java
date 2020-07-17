package com.exp.codwars.person;

import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class Person {

    private String name;
    private SexType sex;
    private int age;

    private Map<ContactType, String> map = new HashMap<>();

    public Person(){
        super();
    };

    public Person(String name, SexType sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
