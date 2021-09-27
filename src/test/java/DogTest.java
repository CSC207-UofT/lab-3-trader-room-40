import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    Dog d;

    @Before
    public void setUp() throws Exception {
        d = new Dog();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof!", d.sound());
    }
}