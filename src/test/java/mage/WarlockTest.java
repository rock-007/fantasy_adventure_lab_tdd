package mage;

import behaviour.IDefend;
import behaviour.ISpell;
import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.mage.Warlock;
import players.mage.creatures.Creature;
import players.mage.creatures.Dragon;
import weapons.magicalWeapons.Fireball;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private IDefend creature;
    private ISpell fireball;
    private Enemy enemy;
    // private IDefend dragon;

    @Before
    public void before() {
        warlock = new Warlock("Lori Sforza");
        creature = new Dragon("knightDragon");
        fireball = new Fireball();
        enemy = new Troll("troll");
    }

    @Test
    public void canSetDefendPower() {
//        warlock.setCreature((Creature)creature);
        warlock.setDefendPower(creature);
//        warlock.setSpellPower(fireball);
        assertEquals(creature,warlock.getDefendPower());
    }
    @Test
    public void canAttack() {
//        warlock.setCreature((Creature)creature);
        warlock.setDefendPower(creature);
        warlock.setSpellPower(fireball);
        warlock.attackEnemy(enemy);
        assertEquals(70, enemy.getNoOfHealthPoints());
    }

    @Test
    public void hasName() {
        assertEquals("Lori Sforza", warlock.getName());
    }

    @Test
    public void enemyAttacks() {
        warlock.setDefendPower(creature);
        warlock.setSpellPower(fireball);
        enemy.attackPlayer(warlock);
        assertEquals("Lori Sforza", warlock.getName());
    }
}
