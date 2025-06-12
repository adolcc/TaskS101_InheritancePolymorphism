package Level1.Exercise1;

public class PercussionInstr extends Instrument {

    public PercussionInstr(String name, double price) {
        super(name, price);

    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }
}
