package com.exp.codwars.cars;

import java.util.*;

public class Cars {
    private Collection<Car> listCarOriginal;
    private Map<Model, Collection<Car>> map;
    private Map<Integer, Collection<Car>> mapYear;
    private Map<Model, Map<Integer, Collection<Car>>> mapModel;

    public Cars() {
        super();
        listCarOriginal = new ArrayList<>();
        map = new HashMap<>();
        mapYear = new HashMap<>();
        mapModel = new HashMap<>();

        listCarOriginal.add(new Car(Model.AUDI, "RS6 Avant by ABT (C8)", 2020));
        listCarOriginal.add(new Car(Model.AUDI, "Q7 55 TFSI e Quattro S-Line (4M) (UK)", 1998));
        listCarOriginal.add(new Car(Model.AUDI, "A7 Sportback 55 TFSI e Quattro S-Line (UK)", 2020));
        listCarOriginal.add(new Car(Model.BMW, "2002 tii by Alpina (E10)", 1973));
        listCarOriginal.add(new Car(Model.BMW, "X7 M50i (G07) (JP)", 2019));
    }

    public void makeGroup() {
        for (Car c : listCarOriginal) {
            Collection<Car> listCar = map.get(c.getModel());
            if (listCar == null) {
                listCar = new ArrayList<>();
                map.put(c.getModel(), listCar);
            }
            listCar.add(c);
        }
    }

    public void yearPlanking() {
        for (Map.Entry<Model, Collection<Car>> entry : map.entrySet()) {
            Model model = entry.getKey();
            Collection<Car> cars = entry.getValue();
            for (Car car : cars) {
                Collection<Car> listCar = mapYear.get(car.getYear());
                int year = car.getYear();
                if (listCar == null) {
                    listCar = new ArrayList<>();
                    mapYear.put(year, listCar);
                }
                listCar.add(car);
            }
            mapModel.put(model, mapYear);
        }
    }

    public void yearUpPlanking() {

    }

}
