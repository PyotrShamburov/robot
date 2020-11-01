package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead(100);
        ToshibaHead toshibaHead = new ToshibaHead(130);
        SamsungHead samsungHead = new SamsungHead(120);

        SonyLeg sonyLeg = new SonyLeg(98);
        ToshibaLeg toshibaLeg = new ToshibaLeg(112);
        SamsungLeg samsungLeg = new SamsungLeg(115);

        SonyHand sonyHand = new SonyHand(117);
        ToshibaHand toshibaHand = new ToshibaHand(124);
        SamsungHand samsungHand = new SamsungHand(95);

        Robot robot1 = new Robot(sonyHead,toshibaHand,samsungLeg);
        Robot robot2 = new Robot(samsungHead,sonyHand,toshibaLeg);
        Robot robot3 = new Robot();
        robot3.setHand(samsungHand);
        robot3.setHead(toshibaHead);
        robot3.setLeg(sonyLeg);

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();

        int x = robot1.getPrice();
        int y = robot2.getPrice();
        int z = robot3.getPrice();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



        if ( x > y && x > z){
            System.out.println("Первый самый дорогой");
        } else if ( y > x && y > z ){
            System.out.println("Второй самый дорогой");
        } else {
            System.out.println("Третий самый дорогой");
        }


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
