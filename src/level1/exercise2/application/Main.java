package level1.exercise2.application;

import level1.exercise2.model.Car;

public class Main {
    public static void main(String[] args) {
        Car.brake();

        Car myCar = new Car(204);
        myCar.accelerate();

        System.out.println("Brand: " + Car.BRAND);
        System.out.println("Model: " + Car.model);
        System.out.println("Power: " + myCar.power);
    }
}