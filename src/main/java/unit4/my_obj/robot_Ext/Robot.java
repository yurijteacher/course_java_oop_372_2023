package unit4.my_obj.robot_Ext;

public class Robot {

    double c1 = 30;
    private double c = 20;

    protected double x = 0;
    protected double y = 0;
    protected double course = 10;
    protected double dist = 20;

    public Robot() {
    }

    public Robot(double x, double y, double course, double dist) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.dist = dist;
    }

    protected void print() {
        System.out.println("Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", dist=" + dist +
                '}');
    }

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.x = 10;

        robot.print();

    }
}
