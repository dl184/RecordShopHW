import Instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDrums {

    Drums drums;

    @Before
    public void setUp() {
        drums = new Drums("Roland", "6 Piece", "Red");
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Roland", drums.getManufacturer());
    }

    @Test
    public void hasType() {
        assertEquals("6 Piece", drums.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", drums.getColour());
    }
}


