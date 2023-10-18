package unit4.my_obj.robot_Ext;

public class RobotExt2 extends RobotExt {
    private double total = 100;
    public static void main(String[] args) {

        RobotExt2 robotExt2 =new RobotExt2();
        robotExt2.x = 100;
        robotExt2.y = 200;

        robotExt2.print();

        System.out.println(robotExt2.total);

    }

}
