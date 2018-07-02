import Accessories.DrumSticks;
import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestShop {

    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    Shop shop;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("Lars Urlich", "5A", 14.50, 22);
        guitarStrings = new GuitarStrings("Elixir", "light", 12.25, 23.99);

        shop = new Shop("Derek's Music Shop");

        shop.addToStock(drumSticks);
        shop.addToStock(guitarStrings);
        }

    @Test
    public void canAddToStock() {
        shop.addToStock(drumSticks);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemove() {
        shop.removeFromStock(drumSticks);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void totalProfit() {
        assertEquals(19.24, shop.markUp());
    }
}
