package FighterTest;

import org.junit.Before;
import org.junit.Test;
import players.figters.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Dwarfy");
    }

    @Test
    public void dwarfHasName() {
        assertEquals("Dwarfy", dwarf.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, dwarf.getNoOfHealthPoints(), 0.00);
    }

    @Test
    public void startsWithNoWeapons() {
        assertEquals(0, dwarf.getWeaponStock().size());
    }
}
