package HomeWork19;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private final String numberCar;

    private final String model;

    private final String color;

    private final Long run;

    private final Long price;

    public Car(String numberCar, String model, String color, Long run, Long price) {
        this.numberCar = numberCar;
        this.model = model;
        this.color = color;
        this.run = run;
        this.price = price;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Long getRun() {
        return run;
    }

    public Long getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getNumberCar(), car.getNumberCar()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getRun(), car.getRun()) &&
                Objects.equals(getPrice(), car.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberCar(), getModel(), getColor(), getRun(), getPrice());
    }


    @Override
    public int compareTo(Car o) {
        return this.model.hashCode() - o.getModel().hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberCar='" + numberCar + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", run=" + run +
                ", price=" + price +
                '}';
    }
}

