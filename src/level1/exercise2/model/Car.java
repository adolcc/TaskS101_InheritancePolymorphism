package level1.exercise2.model;

public class Car {

    public static final String BRAND = "MINI cooper";

    public static String model = "MINI cooper S";

    public final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void brake() {
        System.out.println("The vehicle is braking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
}
