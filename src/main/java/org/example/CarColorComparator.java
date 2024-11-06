package org.example;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {

        if (car1 == null && car2 == null) {
            return 0;
        }
        if (car1 == null) {
            return -1;
        }
        if (car2 == null) {
            return 1;
        }

        int colorComparison = car1.getColor().compareTo(car2.getColor());              // Сравнение по цвету
        if (colorComparison != 0) {
            return colorComparison;                           // Если цвета разные, возвращаем результат сравнения
        }

        return Integer.compare(car1.getYear(), car2.getYear());                    // Дополнительное сравнение, по году
    }
}
