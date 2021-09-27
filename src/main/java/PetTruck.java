public class PetTruck implements Drivable, Domesticatable, Tradable{

    private int max_speed;

    public PetTruck() {this.max_speed = 5;}

    @Override
    public String sound() {
        return "vroooooooooooooooooooooooooooooom";
    }

    @Override
    public void upgradeSpeed() {
    this.max_speed++;
    }

    @Override
    public void downgradeSpeed() {
    this.max_speed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
