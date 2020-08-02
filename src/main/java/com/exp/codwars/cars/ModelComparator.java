package com.exp.codwars.cars;

import java.util.Comparator;

public class ModelComparator implements Comparator<Model> {
    @Override
    public int compare(Model o1, Model o2) {
        return -o1.name().compareTo(o2.name());
    }
}
