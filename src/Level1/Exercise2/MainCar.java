package Level1.Exercise2;

public class MainCar {
    public static void main(String[] args) {
        Car.brake();

        Car myCar = new Car(200);
        myCar.accelerate();

        System.out.println("Brand: " + Car.BRAND);
        System.out.println("Model: " + Car.model);
        System.out.println("Power: " + myCar.power);
    }
}