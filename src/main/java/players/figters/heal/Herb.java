package players.figters.heal;

import behaviour.IHeal;
import players.figters.Fighter;

public class Herb implements IHeal {

    private int healingPower;

    public Herb(){
        this.healingPower = 15;
    }

    @Override
    public void heal(Fighter fighter) {
        fighter.addHealing(this.healingPower);

    }
}
