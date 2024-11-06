package org.example;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Garaj garaj = new Garaj("prostoGaraj");

        garaj.addCar(new Car("yellow", "N 625 KO", 2006, "Mazda"));
        garaj.addCar(new Car("green", "M 536 TR", 2021, "Lada"));
        garaj.addCar(new Car("yellow", "T 598 NT", 1998, "BMW"));
        garaj.addCar(new Car("black", "C 892 CC", 2007, "Mazda"));
        garaj.addCar(new Car("brown", "R 518 OL", 1985, "Opel"));
        garaj.addCar(new Car("orange", "L 123 HY", 2020, "Renault"));
        garaj.addCar(new Car("black", "K 985 KO", 2017, "Lada"));
        garaj.addCar(new Car("yellow", "T 952 PL", 2001, "Mazda"));
        garaj.addCar(new Car("purple", "P 015 TU", 2022, "Toyota"));
        garaj.addCar(new Car("brown", "T 039 RT", 1993, "Renault"));
        garaj.addCar(new Car("orange", "K 625 KO", 1989, "Toyota"));

        printSpiska(garaj);
        compCarYear(garaj);
        compCarColor(garaj);
    }

    private static void compCarColor(Garaj garaj) {
        System.out.println("Spisok mashin posle sortirovki po cvetam: ");
        TreeSet<Car> sortedCars = new TreeSet<>(new CarColorComparator());
        sortedCars.addAll(garaj.getCars());

        for (Car car : sortedCars) {
            System.out.println("\t" + car.getColor() + "\t" + car.getNumber() + "\t" + car.getYear() + "\t" + car.getNameCar());
        }
    }

    private static void compCarYear(Garaj garaj) {
        System.out.println("Spisok mashin posle sortirovki po godam: ");
        TreeSet<Car> sortedCars = new TreeSet<>(new CarYearComparator());
        sortedCars.addAll(garaj.getCars());

        for (Car car : sortedCars) {
            System.out.println("\t" + car.getColor() + "\t" + car.getNumber() + "\t" + car.getYear() + "\t" + car.getNameCar());
        }
    }

    private static void printSpiska(Garaj garaj) {
        System.out.println("Spisok mashin v " + garaj.getNameGaraja() + " bez sortirovki: ");
        for (Car car : garaj.getCars()) {
            System.out.println("\t" + car.getColor() + "\t" + car.getNumber() + "\t" + car.getYear() + "\t" + car.getNameCar());
        }
    }
}

