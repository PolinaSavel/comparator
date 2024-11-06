package org.example;

public class Car {
    private String color;
    private String number;
    private int year;
    private String nameCar;

    public Car(String color, String number, int year, String nameCar) {
        this.color = color;
        this.number = number;
        this.year = year;
        this.nameCar = nameCar;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public String getNameCar() {
        return nameCar;
    }
}
