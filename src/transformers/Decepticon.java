package transformers;

import interfaces.weapon.IGun;

public abstract class Decepticon extends Transformer {
    public Decepticon(int health) {
        super(health);
    }

    public void reload() {
        ((IGun) weapon).reload();
    }
}
