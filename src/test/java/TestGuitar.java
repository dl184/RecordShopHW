import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Gibson", "Electric", "Blue");
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Gibson", guitar.getManufacturer());
    }

    @Test
    public void hasType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", guitar.getColour());
    }
}
