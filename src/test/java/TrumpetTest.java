import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("brass", "toot", 50, 100, 3);
    }
    @Test
    public void CanGetValves() {
        assertEquals(3, trumpet.getValves());
    }


    @Test
    public void CanPlay() {
        assertEquals("toot", trumpet.play());
    }

    @Test
    public void CanCalulateMarkUp() {
        assertEquals(50, trumpet.calulateMarkUp());
    }
}
