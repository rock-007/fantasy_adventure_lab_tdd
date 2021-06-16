package players.mage.creatures;

import behaviour.IDefend;
import enemies.Enemy;

public abstract class Creature implements IDefend {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
