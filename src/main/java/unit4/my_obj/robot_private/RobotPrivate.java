package unit4.my_obj.robot_private;

import unit4.my_obj.Robot;

public class RobotPrivate {

    private double x = 0;
    private double y = 10;
    private double distance = 0;
    private double course = 0;

    public RobotPrivate() {}

    public static void main(String[] args) {


        RobotPrivate robot1 = new RobotPrivate();

        robot1.x = 1;
        robot1.y = 2;
        robot1.course = 3;
        robot1.distance = 4;


        System.out.println(robot1.x + ", " + robot1.y + ", " + robot1.distance + ", " + robot1.course);

        robot1.print();
    }


    public void print(){
        System.out.println(x + ", " + y + ", " + distance + ", " + course);
    }
}
