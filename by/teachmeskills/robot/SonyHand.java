package by.teachmeskills.robot;

public class SonyHand implements IHand{
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {}

    @Override
    public void upHand() {System.out.println("Sony поднимает руки вверх");}

    @Override
    public int getPrice() {
        return price;
    }
}
