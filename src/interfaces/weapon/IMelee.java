package interfaces.weapon;

import transformers.Transformer;

public interface IMelee extends IWeapon {
    void comboAttack(Transformer target);
}
