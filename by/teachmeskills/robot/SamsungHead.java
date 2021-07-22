package by.teachmeskills.robot;

public class SamsungHead implements IHead{
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {}

    @Override
    public void speek() {System.out.println("Говорит голова Samsung");}

    @Override
    public int getPrice() {
        return price;
    }

}
