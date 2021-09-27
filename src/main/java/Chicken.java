public class Chicken implements Domesticatable, Tradable {

    public Chicken() {
    }

    /**
     * Get a string representation of the sound of this Chicken.
     * @return the sound this Chicken makes.
     */
    public String sound() {
        return "Cluck cluck!";
    }

    /**
     * Get the price of this Chicken.
     * @return the price of this animal.
     */
    public int getPrice() {
        return 9001;
    }
}
