package weapons.physicalWeapons;

import behaviour.IWeapon;
import enemies.Enemy;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword() {
        this.damageValue = 40;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.updateHealthPoints(damageValue);

    }
}
