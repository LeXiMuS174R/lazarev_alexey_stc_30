package HomeWork19;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        try {

            /*
             * #1 Номера всех автомобилей, имеющих черный цвет или нулевой пробег.
             */

            Files.lines(Paths.get("src/cars.txt"))
                    .map(line -> line.split(" "))
                    .map(array -> new Car(array[0], array[1], array[2], Long.parseLong(array[3]), Long.parseLong(array[4])))
                    .filter(car -> car.getColor().equals("Black") || car.getRun().equals(0L))
                    .forEach(car -> System.out.println(car.getNumberCar()));

            /*
             * #2 Количество уникальных моделей в ценовом диапазоне от 700 до 800 тыс.
             */

            int size = Files.lines(Paths.get("src/cars.txt"))
                    .map(line -> line.split(" "))
                    .map(array -> new Car(array[0], array[1], array[2], Long.parseLong(array[3]), Long.parseLong(array[4])))
                    .map(Car::getModel)
                    .collect(Collectors.toSet()).size();
            System.out.println(size);

            /*
             * #3 Вывести цвет автомобиля с минимальной стоимостью.
             */

            String color = Files.lines(Paths.get("src/cars.txt"))
                    .map(line -> line.split(" "))
                    .map(array -> new Car(array[0], array[1], array[2], Long.parseLong(array[3]), Long.parseLong(array[4])))
                    .min(Comparator.comparing(Car::getPrice))
                    .get()
                    .getColor();
            System.out.println(color);

            /*
             * #4 СредняяЯ стоимость Camry.
             */

            OptionalDouble se = Files.lines(Paths.get("src/cars.txt"))
                    .map(line -> line.split(" "))
                    .map(array -> new Car(array[0], array[1], array[2], Long.parseLong(array[3]), Long.parseLong(array[4])))
                    .filter(car -> car.getModel().equals("TOYOTA_CAMRY"))
                    .mapToLong(Car::getPrice)
                    .average();
            System.out.println(se);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
