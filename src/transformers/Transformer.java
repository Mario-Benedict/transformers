package transformers;

import weapons.Weapon;

public abstract class Transformer {
    protected int health;
    protected final int maxHealth;
    protected boolean isAltMode = false;
    protected Weapon weapon = null;

    public Transformer(int health) {
        this.health = health;
        maxHealth = health;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void attack(Transformer target) {
        if (isAltMode) return;

        weapon.use(target);
    }

    public void transform() {
        isAltMode = !isAltMode;
    }
}
