package weapons;

import interfaces.weapon.IGun;
import transformers.Transformer;

public class WeaponGun extends Weapon implements IGun {
    protected final int baseBullets;
    protected int bullets;

    public WeaponGun(int baseDamage, int baseBullet) {
        super(baseDamage);
        this.baseBullets = baseBullet;
        this.bullets = baseBullets;
    }

    @Override
    public void use(Transformer target) {
        if (bullets < 1) return;

        target.takeDamage(baseDamage * bullets);
        bullets = 0;
    }

    @Override
    public void reload() {
        bullets = baseBullets;
    }
}
