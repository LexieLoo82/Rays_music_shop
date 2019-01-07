import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiscTest {

    Misc misc;

    @Before
    public void before(){
        misc = new Misc("music sheets", 2, 4);
    }

    @Test
    public void getDescription() {
        assertEquals("music sheets", misc.getDescription());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(2, misc.getBuyPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(4, misc.getSellPrice());
    }

    @Test
    public void calulateMarkUp() {
        assertEquals(2, misc.calulateMarkUp());
    }
}
