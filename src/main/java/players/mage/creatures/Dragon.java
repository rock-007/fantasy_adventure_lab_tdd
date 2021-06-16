package players.mage.creatures;

import enemies.Enemy;

public class Dragon extends Creature {
    private int damageValue;

    public Dragon(String name) {
        super(name);
        damageValue = 50;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void defend(Enemy enemy) {
        enemy.updateHealthPoints(damageValue);
    }
}
