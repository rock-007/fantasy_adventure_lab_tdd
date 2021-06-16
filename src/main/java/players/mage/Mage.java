package players.mage;

import behaviour.IDefend;
import behaviour.ISpell;
import enemies.Enemy;
import players.mage.creatures.Creature;

public abstract class Mage {
    private String name;
    private ISpell spellPower;
    private IDefend defendPower;

    //    private DualWeapon dualWeapon;
    public Mage(String name) {
        this.name = name;
    }

    public ISpell getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(ISpell spellPower) {
        this.spellPower = spellPower;
    }

    public IDefend getDefendPower() {
        return defendPower;
    }

    public void setDefendPower(IDefend defendPower) {
        this.defendPower = defendPower;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
}
