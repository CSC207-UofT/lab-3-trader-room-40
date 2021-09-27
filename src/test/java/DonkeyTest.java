import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DonkeyTest {
    Donkey d;
    Horse h;

    @Before
    public void setUp() throws Exception {
        d = new Donkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Hee-haw!", d.sound());
    }

    @Test(timeout = 50)
    public void testgetmaxload() {
        assertEquals(20, d.getMaxLoad());
    }

}
}
