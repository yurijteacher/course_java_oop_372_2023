package unit4.my_obj.robot_manager;

import unit4.my_obj.Robot;
import unit4.my_obj.robot_Ext.RobotExt;
import unit4.my_obj.robot_public.RobotPublic;

public class Main {

    public static void main(String[] args) {


        Robot robot = new Robot();
        // robot.x =
        // robot.y
        // robot.distance

        robot.print();


        RobotPublic robotPublic = new RobotPublic();

        robotPublic.x = 10;

        robotPublic.print();

        unit4.my_obj.robot_Ext.Robot robot1 = new RobotExt();

        // robot1.x = 5;

        // RobotExt robotExt = new RobotExt();

        // robotExt.x = 5;

    }
}
