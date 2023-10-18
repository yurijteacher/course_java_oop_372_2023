package unit4.my_obj;

public class Robot {

    double x = 0;
    double y = 10;
    double distance = 0;
    double course = 0;

    public Robot() {}

    public static void main(String[] args) {

        Robot robot;
        robot = new Robot();

        Robot robot1 = new Robot();

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
