package level2.application;

import level2.model.Smartphone;

public class MainPhone {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung", "Galaxy S22");

        myPhone.call("123-456-789");
        myPhone.takePhoto();
        myPhone.alarm();
    }
}


