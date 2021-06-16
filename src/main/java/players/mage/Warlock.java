package players.mage;

import enemies.Enemy;

public class Warlock extends Mage {


    public Warlock(String name) {
        super(name);
    }

    public void attackEnemy(Enemy enemy) {
        this.getSpellPower().castSpell(enemy);


    }
}
