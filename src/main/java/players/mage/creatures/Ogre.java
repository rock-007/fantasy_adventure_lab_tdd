package players.mage.creatures;

import enemies.Enemy;

public class Ogre extends Creature {
    private int damageValue;


    public Ogre(String name) {
        super(name);
        this.damageValue = 25;
    }

    public int getDamageValue() {
        return this.damageValue;
    }

    public void defend(Enemy enemy) {
        enemy.updateHealthPoints(damageValue);
    }
}
