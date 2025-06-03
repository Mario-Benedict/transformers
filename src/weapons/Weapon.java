package weapons;

import interfaces.weapon.IWeapon;
import transformers.Transformer;

public abstract class Weapon implements IWeapon {
    protected final int baseDamage;

    public Weapon(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    @Override
    public void use(Transformer target) {
        target.takeDamage(baseDamage);
    }
}
