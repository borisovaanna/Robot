package by.teachmeskills.robot;

public class SonyLeg implements ILeg{
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {}

    @Override
    public void step() {System.out.println("Sony идёт, берегись!");}

    @Override
    public int getPrice() {
        return price;
    }
}
