package weapons;

import interfaces.weapon.IFire;
import transformers.Transformer;

import java.util.List;

public class Flamethrower extends Weapon implements IFire {
    public Flamethrower(int baseDamage) {
        super(baseDamage);
    }

    @Override
    public void infernoBurst(List<Transformer> targets) {
        targets.forEach((target) -> {
            target.takeDamage(baseDamage);
        });
    }
}
