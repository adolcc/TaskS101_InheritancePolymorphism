package level1.exercise1.application;

import level1.exercise1.model.Instrument;
import level1.exercise1.model.PercussionInstr;
import level1.exercise1.model.StringInstr;
import level1.exercise1.model.WindInstr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Accessing the static block without creating instances...");
        System.out.println("Class name: " + Instrument.class.getName());

        System.out.println("\nCreating an instance of Wind Instrument:");
        Instrument flute = new WindInstr("Flute", 1250.99);
        System.out.println("Name: " + flute.getName() + ", Price: $" + flute.getPrice());
        flute.play();

        System.out.println("\nCreating another instance of String Instrument:");
        Instrument guitar = new StringInstr("Guitar", 860.0);
        System.out.println("Name: " + guitar.getName() + ", Price: $" + guitar.getPrice());
        guitar.play();

        System.out.println("\nCreating an instance of Percussion Instrument:");
        Instrument drum = new PercussionInstr("Drums", 1325.0);
        System.out.println("Name: " + drum.getName() + ", Price: $" + drum.getPrice());
        drum.play();
    }
}
