public class Donkey implements Domesticatable, Tradable {
    private int maxLoad;

    public Donkey() {
        this.maxLoad = 20;
    }

    @Override
    public String sound() {
        return "Hee-haw!";
    }

    @Override
    public int getPrice() {
        return 5;
    }

    public int getMaxLoad() {
        return this.maxLoad;
    }
}


