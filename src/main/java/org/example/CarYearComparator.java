package org.example;

import java.util.Comparator;

public class CarYearComparator implements Comparator <Car> {

    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getYear() == car2.getYear()){
            return 0;
        }
        if (car1.getYear() < car2.getYear()){
            return 1;
        }
        return  -1;
    }
}
