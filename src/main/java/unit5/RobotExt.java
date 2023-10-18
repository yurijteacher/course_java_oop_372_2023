package unit5;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    public double getTotalDistance() {
        return totalDistance;
    }

    @Override
    public void forward(double distance) {
        super.setDistance(distance);
        super.forward(distance);
        totalDistance +=getDistance();
    }

    @Override
    public String toString() {
        return "RobotExt{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", course=" + getCourse() +
                ", distance=" + getDistance() +
                ", totalDistance=" + totalDistance +
                '}';
    }
    public RobotExt() {}

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }
}
