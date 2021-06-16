package FighterTest;

import org.junit.Before;
import org.junit.Test;
import players.figters.Dwarf;
import players.figters.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;

    @Before
    public void before() {
        knight = new Knight("Knighty");
    }

    @Test
    public void dwarfHasName() {
        assertEquals("Knighty", knight.getName());
    }
}
