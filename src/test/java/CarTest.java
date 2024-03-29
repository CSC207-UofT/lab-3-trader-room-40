import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(20, c.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(22, c.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(18, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, c.getPrice());
    }

}