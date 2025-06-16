package level1.exercise1.model;

public class StringInstr extends Instrument {

    public StringInstr(String name, double price) {
        super(name, price);

    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }
}
