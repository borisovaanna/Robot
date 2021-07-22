package by.teachmeskills.robot;

public class ToshibaHand implements IHand{

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {}

    @Override
    public void upHand() {System.out.println("Toshiba поднимает руки вверх");}

    @Override
    public int getPrice() {
        return price;
    }
}
