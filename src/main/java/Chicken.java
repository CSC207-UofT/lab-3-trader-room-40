public class Chicken implements Domesticatable, Tradable {

    /**
     * Sound thing.
     * @return the sound this Chicken makes.
     */
    public String sound() {
        return "Cluck cluck!";
    }

    /**
     * Price thing. It's over 9000!
     * @return the price of this animal.
     */
    public int getPrice() {
        return 9001;
    }
}
