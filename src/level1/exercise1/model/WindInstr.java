package level1.exercise1.model;

public class WindInstr extends Instrument {

    public WindInstr(String name, double price) {
        super(name, price);

    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");

    }
}
