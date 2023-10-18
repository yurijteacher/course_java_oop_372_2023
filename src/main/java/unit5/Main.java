package unit5;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        final int count = 12;

        int size = 50;

        Robot robot2 = new Robot(350, 100);

        for (int i=0; i<count; i++) {
            robot2.forward(size);
            robot2.setCourse(robot2.getCourse() + 360/count);
            robot2.forward(size);
        }

        RobotFrame frame = new RobotFrame(robot2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        Robot robot = new Robot(0,0,0,0);
        // robot.x =5;
        robot.setX(0);

        System.out.println(robot);

        robot.setCourse(360);
        robot.forward(100);
        System.out.println(robot);


        robot.setCourse(45);
        robot.forward(100);

        System.out.println(robot);

        RobotExt robotExt = new RobotExt(0,0,100,0);

        robotExt.setCourse(45);
        robotExt.forward(100);

        robotExt.setCourse(45);
        robotExt.forward(100);
        System.out.println(robotExt);



        RobotExt robot1 = new RobotExt();
        robot1.setCourse(100);
        robot1.forward(100);
        robot1.setCourse(100);
        robot1.forward(150);
        robot1.setCourse(45);
        robot1.forward(250);


        for (RobotLine el: robot1.getRobotLines()){
            System.out.println(el);
        }

        System.out.println(robot1.getTotalDistance());
    }
}
