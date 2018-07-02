import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPiano {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steinway", "Grand Piano", "Black");

    }

    @Test
    public void hasManufacturer() {
        assertEquals("Steinway", piano.getManufacturer());
    }

    @Test
    public void hasType() {
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }
}
