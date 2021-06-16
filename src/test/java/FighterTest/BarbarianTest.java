package FighterTest;

import behaviour.IHeal;
import behaviour.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.figters.Barbarian;
import players.figters.heal.Herb;
import players.figters.heal.Potion;
import weapons.physicalWeapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private IHeal heal;
    private Potion potion;
    private Herb herb;
    private IWeapon swordWeapon;
//    private Sword swordWeapon;

    @Before
    public void before() {
        barbarian = new Barbarian("John");
        potion = new Potion();
        herb = new Herb();
        swordWeapon = new Sword();
    }

    @Test
    public void barbarianHasName() {
        assertEquals("John", barbarian.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, barbarian.getNoOfHealthPoints(), 0.00);
    }

    @Test
    public void startsWithNoWeapons() {
        assertEquals(0, barbarian.getWeaponStock().size());
    }

    @Test
    public void canAddClericHeal() {
        barbarian.setCleric(herb);
        assertEquals(herb, barbarian.getCleric().getHeal());
    }

    @Test
    public void canAddWeapon() {
        barbarian.addWeapon(swordWeapon);
        assertEquals(1, barbarian.getWeaponStock().size());
    }

    @Test
    public void canSetCurrentWeapon() {
        barbarian.addWeapon(swordWeapon);
        barbarian.setCurrentWeapon(swordWeapon);
        assertEquals(swordWeapon, barbarian.getCurrentWeapon());
    }


    

    @Test
    public void attack() {
        assertEquals(swordWeapon, barbarian.changeWeapon(swordWeapon));
    }

}
