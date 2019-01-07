import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Misc misc;
    Trumpet trumpet;

    @Before
    public void before(){
        misc = new Misc("music sheets", 2, 4);
        guitar = new Guitar("wood", "strumm", 20, 40, 5);
        trumpet = new Trumpet("brass", "toot", 50, 100, 3);
        shop = new Shop();
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.countStock());
    }


    @Test
    public void canSellStock(){
        shop.addStock(guitar);
        shop.addStock(misc);
        shop.addStock(trumpet);
        shop.sellStock(guitar);
        assertEquals(2, shop.countStock());

    }

    @Test
    public void cancalculateProfit(){
        shop.addStock(guitar);
        shop.addStock(misc);
        shop.addStock(trumpet);
        assertEquals(72, shop.getProfit());

    }





}