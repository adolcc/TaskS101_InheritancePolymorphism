package Level1.Exercise1;

public class StringInstr extends Instrument {

    public StringInstr(String name, double price) {
        super(name, price);

    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }
}
