import org.junit.*;
import static org.junit.Assert.*;

public class ChickenTest {
    Chicken chicken;

    @Test(timeout=50)
    public void testSound() {
        chicken = new Chicken();
        assertEquals("Cluck cluck!", chicken.sound());
    }

    @Test(timeout=50)
    public void testGetPrice() {
        chicken = new Chicken();
        assertEquals(9001, chicken.sound());
    }
}
