package Level1.Exercise1;

public class WindInstr extends Instrument {

    public WindInstr(String name, double price) {
        super(name, price);

    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");

    }
}
