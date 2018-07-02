import Accessories.Accessory;
import Accessories.DrumSticks;
import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestAccessory {

    DrumSticks drumsticks;
    GuitarStrings guitarStrings;

//    manu   type  price
    @Before
    public void setUp() {
        drumsticks = new DrumSticks("Lars Urlich", "5A", 15.99, 25.50);
        guitarStrings = new GuitarStrings("Elixir", "light", 22.99, 35.50);

        }

    @Test
    public void hasManufacturer() {
        assertEquals("Lars Urlich", drumsticks.getManufacturer());
        assertEquals("Elixir", guitarStrings.getManufacturer());

        }

    @Test
    public void hasType() {
        assertEquals("5A", drumsticks.getType());
        assertEquals("light", guitarStrings.getType());

    }

    @Test
    public void hasPrice() {
        assertEquals(15.99, drumsticks.getBuyPrice());
        assertEquals(22.99, guitarStrings.getBuyPrice());
    }

}
