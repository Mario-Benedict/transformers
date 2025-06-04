package transformers.characters;

import transformers.Decepticon;
import interfaces.mode.IFlight;

public class Starscream extends Decepticon implements IFlight {
    public Starscream(int health) {
        super(health);
    }

    @Override
    public void fly() {
        if (!isAltMode) return;

        System.out.println("Starscream is flying");
    }
}
