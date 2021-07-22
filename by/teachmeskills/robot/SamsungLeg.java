package by.teachmeskills.robot;

public class SamsungLeg implements ILeg{
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {}

    @Override
    public void step() {System.out.println("Samsung идёт, берегись!");}

    @Override
    public int getPrice() {
        return price;
    }
}
