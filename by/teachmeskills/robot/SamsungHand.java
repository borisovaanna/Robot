package by.teachmeskills.robot;

public class SamsungHand implements IHand{
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice1() {
        return price;
    }

    public void setPrice1(int price) {
        this.price = price;
    }

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {}

    @Override
    public void upHand() {System.out.println("Samsung поднимает руки вверх");}

    @Override
    public int getPrice() {
        return this.price;
    }
}
