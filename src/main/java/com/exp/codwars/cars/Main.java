package com.exp.codwars.cars;

import java.util.Collection;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars();
        Map<Model, Map<Integer, Collection<Car>>> modelMapMap = cars.yearPlanking(cars.makeGroup());
        cars.takeYearInterval(1973, 2019, modelMapMap);
    }
}
