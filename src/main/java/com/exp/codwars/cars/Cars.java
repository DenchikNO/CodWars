package com.exp.codwars.cars;

import java.util.*;

public class Cars {
    private Collection<Car> listCarOne;
    private Map<Model, String> map;

    public Cars() {
        super();
        listCarOne = new ArrayList<>();
        map = new HashMap<>();

        listCarOne.add(new Car(Model.AUDI, "RS6 Avant by ABT (C8)",2018 ));
        listCarOne.add(new Car(Model.AUDI, "Q7 55 TFSI e Quattro S-Line (4M) (UK)",1998 ));
        listCarOne.add(new Car(Model.AUDI, "A7 Sportback 55 TFSI e Quattro S-Line (UK)",2020 ));
        listCarOne.add(new Car(Model.BMW, "2002 tii by Alpina (E10)",1973 ));
        listCarOne.add(new Car(Model.BMW, "X7 M50i (G07) (JP)",2019 ));
    }

    public void makeGroup() {
        for (Car c: listCarOne){
            Model model = c.getModel();
            String name = c.getName();
            map.put(model,name);
        }
    }
}
