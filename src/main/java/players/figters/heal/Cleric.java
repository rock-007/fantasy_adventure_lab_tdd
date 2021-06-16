package players.figters.heal;

import behaviour.IHeal;

public class Cleric {

    private IHeal heal;

    public Cleric(IHeal heal) {
        this.heal = heal;
    }

    public IHeal getHeal() {
        return heal;
    }
}
