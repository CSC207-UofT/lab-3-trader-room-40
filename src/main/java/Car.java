/* A sample class that implements the given interfaces.
 */
public class Car implements Drivable, Domesticatable, Tradable {
    public int maxSpeed;

    public Car(){this.maxSpeed = 20.0;}

    @Override
    public String sound() {return ("Vroom!");}

    @Override
    public void upgradeSpeed() {this.maxSpeed += 2;}


    @Override
    public void downgradeSpeed() {this.maxSpeed -= 2;}

    @Override
    public int getMaxSpeed() {return this.maxSpeed;}

    @Override
    public int getPrice() {return 20;}
}
