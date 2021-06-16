package enemies;

import players.Player;
import players.figters.Fighter;
import players.mage.Warlock;

public class Orc extends Enemy {

    public Orc (String name) {
        super(name);
    }

    @Override
    public void attackPlayer(Fighter fighter) {
        fighter.enemyAttacked()
    }
}
