package transformers.characters;

import transformers.Decepticon;
import interfaces.mode.ITank;
import transformers.Transformer;

public class Megatron extends Decepticon implements ITank {
    public Megatron(int health) {
        super(health);
    }

    @Override
    public void drive() {
        if (!isAltMode) return;

        System.out.println("Megatron is chasing Autobot");
    }

    @Override
    public void fire(Transformer target) {
        if (!isAltMode) return;

        target.takeDamage(20);
    }
}
