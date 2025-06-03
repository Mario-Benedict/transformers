package weapons;

import transformers.Transformer;

public class PlasmaCannon extends WeaponGun {
    public PlasmaCannon(int baseDamage, int baseBullets) {
        super(baseDamage, baseBullets);
    }

    @Override
    public void use(Transformer target) {
        if (bullets < 1) return;

        target.takeDamage(baseDamage);

        bullets -= 1;
    }
}
