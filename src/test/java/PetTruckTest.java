import org.junit.*;

import static org.junit.Assert.*;

public class PetTruckTest {
    PetTruck p;

    @Before
    public void setUp() throws Exception {
        p = new PetTruck();
    }

    @Test(timeout = 50)
    public void TestSound() { assertEquals("vroooooooooooooooooooooooooooooom", p.sound());}

    @Test(timeout = 50)
    public void TestSpeed() {assertEquals(5, p.getMaxSpeed());}

    @Test(timeout = 50)
    public void TestIncrease() {
        p.upgradeSpeed();
        assertEquals(6, p.getMaxSpeed());}

    @Test(timeout = 50)
    public void TestDecrease() {
        p.downgradeSpeed();
        assertEquals(4, p.getMaxSpeed());}

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, p.getPrice());
    }

}
