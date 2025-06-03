package transformers.autobot;

import interfaces.mode.IDino;
import transformers.Transformer;
import weapons.Weapon;

import java.util.List;

public abstract class Dinobot extends Autobot implements IDino {
    protected Weapon altWeapon = null;

    protected Weapon activeWeapon = null;

    public Dinobot(int health) {
        super(health);
    }

    public void setWeapon(Weapon mainWeapon, Weapon altWeapon) {
        this.weapon = mainWeapon;
        this.altWeapon = altWeapon;

        activeWeapon = mainWeapon;
    }

    public abstract void attack(List<Transformer> targets);
}
