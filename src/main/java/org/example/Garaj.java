package org.example;

import java.util.ArrayList;
import java.util.List;

public class Garaj {
    private List<Car> cars;;
    private String nameGaraja;

    public Garaj(String nameGaraja) {
        this.nameGaraja = nameGaraja;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public String getNameGaraja() {
        return nameGaraja;
    }
}