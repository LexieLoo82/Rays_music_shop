import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("electronic", "plinkyplonk", 100, 250, 90);
    }

    @Test
    public void getKeys() {
        assertEquals(90, keyboard.getKeys());
    }


    @Test
    public void play() {
        assertEquals("plinkyplonk", keyboard.play());
    }

    @Test
    public void calulateMarkUp() {
        assertEquals(150, keyboard.calulateMarkUp());
    }
}