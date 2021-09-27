public class Car implements Tradable, Drivable {

    public int speed;

    /**
     * Construct a Car instance, which has its speed set to the constructor parameter speed.
     */
    public Car(int speed) {
        this.speed = speed;
    }

    /**
     * Increase the maximum speed of this Car by 10.
     **/
    @Override
    public void upgradeSpeed() {
        this.speed += 10;
    }

    /**
     * Decrease the maximum speed of this Car by 10;.
     **/
    @Override
    public void downgradeSpeed() {
        this.speed -= 10;
    }

    /**
     * Return the maximum speed of this Car.
     *
     * @return The current maximum speed of this Car.
     **/
    @Override
    public int getMaxSpeed() {
        return 200;
    }

    public int getSpeed() {
        return this.speed;
    }

    /**
     * Returns the price of this Car.
     *
     * @return the price of this Car.
     */
    @Override
    public int getPrice() {
        return 10000;
    }
}
