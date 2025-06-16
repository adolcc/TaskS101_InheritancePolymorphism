package level2.application;

import level2.model.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung", "Galaxy S22");

        myPhone.call("675-432-000");
        myPhone.takePhoto();
        myPhone.alarm();
    }
}


