package transformers.autobot;

import weapons.WeaponGun;

public abstract class Commander extends Autobot {
    public Commander(int health) {
        super(health);
    }

    public void reload() {
        ((WeaponGun) weapon).reload();
    }
}
