package by.teachmeskills.robot;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();
        IHead head1 = new SonyHead();
        IHead head2 = new ToshibaHead();
        IHead head3 = new SamsungHead();
        IHand hand1 = new SonyHand();
        IHand hand2 = new ToshibaHand();
        IHand hand3 = new SamsungHand();
        ILeg leg1 = new SonyLeg();
        ILeg leg2 = new ToshibaLeg();
        ILeg leg3 = new SamsungLeg();

        SonyHead sonyheadprice = new SonyHead();
        ToshibaHead toshibaheadprice = new ToshibaHead();
        SamsungHead samsungheadprice = new SamsungHead();
        SonyHand sonyhandprice = new SonyHand();
        ToshibaHand toshibahandprice = new ToshibaHand();
        SamsungHand samsunghandprice = new SamsungHand();
        SonyLeg sonylegprice = new SonyLeg();
        ToshibaLeg toshibalegprice = new ToshibaLeg();
        SamsungLeg samsunglegprice = new SamsungLeg();

        sonyheadprice.setPrice(250);
        toshibaheadprice.setPrice(320);
        samsungheadprice.setPrice(295);
        sonyhandprice.setPrice(180);
        toshibahandprice.setPrice(210);
        samsunghandprice.setPrice(190);
        sonylegprice.setPrice(190);
        toshibalegprice.setPrice(235);
        samsunglegprice.setPrice(220);

        robot1.setHead(head1); // 1-ый робот
        robot1.setHand(hand2);
        robot1.setLeg(leg3);

        robot1.setHead(sonyheadprice);
        robot1.setHand(toshibahandprice);
        robot1.setLeg(samsunglegprice);

        robot1.action();
        System.out.print(robot1.getPrice());
        System.out.println();

        robot2.setHead(head3); // 2-ой робот
        robot2.setHand(hand2);
        robot2.setLeg(leg2);

        robot2.setHead(samsungheadprice);
        robot2.setHand(toshibahandprice);
        robot2.setLeg(toshibalegprice);

        robot2.action();
        System.out.print(robot2.getPrice());
        System.out.println();

        robot3.setHead(head2); // 3-ий робот
        robot3.setHand(hand3);
        robot3.setLeg(leg1);

        robot3.setHead(toshibaheadprice);
        robot3.setHand(samsunghandprice);
        robot3.setLeg(sonylegprice);

        robot3.action();
        System.out.print(robot3.getPrice());
        System.out.println();

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.print("Робот 1 дороже!");
        }
        else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()){
            System.out.print("Робот 2 дороже!");
        }
        else {
            System.out.print("Робот 3 дороже!");
        }

    }
}
