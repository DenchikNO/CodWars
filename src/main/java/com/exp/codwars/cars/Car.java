package com.exp.codwars.cars;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Car {

    private Model model;
    private String name;
    private int year;

    public Car(Model model, String name, int year) {
        this.model = model;
        this.name = name;
        this.year = year;
    }
}
