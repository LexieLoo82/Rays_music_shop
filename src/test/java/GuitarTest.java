import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "strumm", 20, 40, 5);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("strumm", guitar.play());
    }

    @Test
    public void canCalculatemarkUp(){
        assertEquals(20, guitar.calulateMarkUp());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(5, guitar.getStrings());
    }

}
