public class Dog implements Domesticatable, Tradable{

    @Override
    public String sound() {
        return "Woof!";
    }

    @Override
    public int getPrice() {
        return "priceless";
    }
}
