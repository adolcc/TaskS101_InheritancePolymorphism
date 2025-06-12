package Level1.Exercise2;

public class Car {

    public static final String BRAND = "Toyota";

    public static String model = "Corolla";

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
