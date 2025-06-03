package transformers.characters;

import interfaces.weapon.IFire;
import interfaces.weapon.IMelee;
import transformers.Transformer;
import transformers.autobot.Dinobot;

import java.util.List;

public class Grimlock extends Dinobot {
    public Grimlock(int health) {
        super(health);
    }

    @Override
    public void transform() {
        System.out.println("Grimlock is transforming into T-Rex");
        activeWeapon = isAltMode ? altWeapon : weapon;
    }

    @Override
    public void attack(Transformer target) {
        activeWeapon.use(target);
    }

    public void attack(List<Transformer> targets) {
        if (!isAltMode) return;

        ((IFire) activeWeapon).infernoBurst(targets);
    }

    public void comboAttack(Transformer target) {
        if (isAltMode) return;

        ((IMelee) activeWeapon).comboAttack(target);
    }

    @Override
    public void tailAttack(Transformer target) {
        if (!isAltMode) return;

        target.takeDamage(15);
    }

    @Override
    public void run() {
        if (!isAltMode) return;

        System.out.println("Grimlock is running away");
    }
}
