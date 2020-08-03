package com.exp.codwars.cars;

import java.util.*;

public class Cars {
    private Collection<Car> listCarOriginal;

    public Cars() {
        super();
        listCarOriginal = new ArrayList<>();

        listCarOriginal.add(new Car(Model.AUDI, "RS6 Avant by ABT (C8)", 2020));
        listCarOriginal.add(new Car(Model.AUDI, "RS6 Avant by ABT (C8)", 2020));
        listCarOriginal.add(new Car(Model.AUDI, "Q7 55 TFSI e Quattro S-Line (4M) (UK)", 1998));
        listCarOriginal.add(new Car(Model.AUDI, "A7 Sportback 55 TFSI e Quattro S-Line (UK)", 2020));
        listCarOriginal.add(new Car(Model.BMW, "2002 tii by Alpina (E10)", 1973));
        listCarOriginal.add(new Car(Model.BMW, "X7 M50i (G07) (JP)", 2019));
    }

    public Map<Model, Collection<Car>> makeGroup() {
        Map<Model, Collection<Car>> map = new HashMap<>();
        for (Car c : listCarOriginal) {
            Collection<Car> listCar = map.get(c.getModel());
            if (listCar == null) {
                listCar = new ArrayList<>();
                map.put(c.getModel(), listCar);
            }
            listCar.add(c);
        }
        return map;
    }

    public Map<Model, Map<Integer, Collection<Car>>> yearPlanking(Map<Model, Collection<Car>> map) {
        CarComparator carComparator = new CarComparator();
        YearComparator yearComparator = new YearComparator();
        ModelComparator modelComparator = new ModelComparator();
        Map<Model, Map<Integer, Collection<Car>>> mapModel = new TreeMap<>(modelComparator);
        for (Map.Entry<Model, Collection<Car>> entry : map.entrySet()) {
            Map<Integer, Collection<Car>> mapYear = new TreeMap<>(yearComparator);
            Model model = entry.getKey();
            Collection<Car> cars = entry.getValue();
            for (Car car : cars) {
                int year = car.getYear();
                Collection<Car> listCar = mapYear.get(year);
                if (listCar == null) {
//                    listCar = new ArrayList<>();
                    listCar = new TreeSet<>(carComparator);
                    mapYear.put(year, listCar);
                }
                listCar.add(car);
//                Collections.sort((List)listCar, carComparator);
            }
            mapModel.put(model, mapYear);
        }
        return mapModel;
    }

    public void takeYearInterval(int yearStart, int yearEnd, Map<Model, Map<Integer, Collection<Car>>> mapModel) {
        Map<Integer, Collection<Car>> mapUpIntervalYear = new HashMap<>();;
        for (Map.Entry<Model, Map<Integer, Collection<Car>>> entry : mapModel.entrySet()) {
            Map<Integer, Collection<Car>> mapYear = entry.getValue();
            for (Map.Entry<Integer, Collection<Car>> e : mapYear.entrySet()){
                if (yearStart <= e.getKey() && e.getKey() <= yearEnd) {
                    mapUpIntervalYear.put(e.getKey(), e.getValue());
                }
            }
        }
    }

}
