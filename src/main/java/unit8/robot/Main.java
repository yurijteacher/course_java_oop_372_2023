package unit8.robot;

public class Main {

    public static void main(String[] args) {

        AppleHead appleHead = new AppleHead();
        SamsungHand samsungHand = new SamsungHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();

//        Robot robot = new Robot();
//        Robot robot1 = new RobotT1000();

        RobotT1000 robotT1000 = new RobotT1000(appleHead, toshibaLeg, samsungHand);
        SamsungHead samsungHead = new SamsungHead();
        System.out.println(robotT1000);
        RobotT1000 robotT1001 = new RobotT1000(samsungHead, toshibaLeg, samsungHand);
        System.out.println(robotT1001);

    }


}
