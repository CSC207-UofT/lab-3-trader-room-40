/***
 * Contains all unit tests for the Car class.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car(50);
    }

    @Test(timeout = 50)
    public void testUpgradeSpeed() {
        int curr_speed = car.getSpeed();
        car.upgradeSpeed();
        assertEquals(curr_speed + 10, car.getSpeed());
    }

    @Test(timeout = 50)
    public void testDowngradeSpeed() {
        int curr_speed = car.getSpeed();
        car.downgradeSpeed();
        assertEquals(curr_speed - 10, car.getSpeed());
    }

    @Test(timeout = 50)
    public void testGetMaxSpeed() {
        assertEquals(200, car.getMaxSpeed());
    }
}
