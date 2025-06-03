package weapons;

import interfaces.weapon.IMelee;
import transformers.Transformer;

public class SpikedClub extends Weapon implements IMelee {
    public SpikedClub(int baseDamage) {
        super(baseDamage);
    }

    @Override
    public void comboAttack(Transformer target) {
        target.takeDamage(baseDamage * 5);
    }
}
