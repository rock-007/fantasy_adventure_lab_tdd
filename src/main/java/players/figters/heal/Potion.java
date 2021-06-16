package players.figters.heal;

import behaviour.IHeal;
import players.figters.Fighter;

public class Potion implements IHeal {
    private int healingPower;

    public Potion() {
        this.healingPower = 30;
    }

    @Override
    public void heal(Fighter fighter) {
        fighter.addHealing(this.healingPower);

    }
}
