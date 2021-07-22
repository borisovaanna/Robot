package by.teachmeskills.robot;

public class ToshibaLeg implements ILeg{
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {}

    @Override
    public void step() {System.out.println("Toshiba идёт, берегись!");}

    @Override
    public int getPrice() {
        return price;
    }
}
