package unit4.my_obj.robot_public;

public class RobotPublic {

    public double x = 0;
    public double y = 10;
    public double distance = 0;
    public double course = 0;

    public RobotPublic() {
    }
    public void print(){
        System.out.println(x + ", " + y + ", " + distance + ", " + course);
    }

    public static void main(String[] args) {

        RobotPublic robotPublic = new RobotPublic();

        robotPublic.x = 5;
        robotPublic.y = 10;

        robotPublic.print();



    }
}
