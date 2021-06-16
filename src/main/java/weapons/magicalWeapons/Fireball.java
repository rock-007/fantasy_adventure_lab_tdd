package weapons.magicalWeapons;

import behaviour.ISpell;
import enemies.Enemy;

public class Fireball implements ISpell {

    private int damageValue;

    public Fireball() {
        this.damageValue = 30;
    }

    public int getDamageValue() {
        return damageValue;
    }

    @Override
    public void castSpell(Enemy enemy)  {
          enemy.updateHealthPoints(damageValue);
    }
}
