package unit8.robot;

import java.sql.SQLOutput;

public class RobotT1000 extends Robot{

    public RobotT1000(Head head, Leg leg, Hand hand) {
        super(head, leg, hand);
    }

    @Override
    public void info() {
        System.out.println("info t1000");
    }

    @Override
    public void takeSomething() {
        System.out.println("takeSomething");
    }

    @Override
    public void calc() {
        System.out.println("calculation t1000");
    }

    @Override
    public void go() {
        System.out.println("go t1000");
    }

    @Override
    void dance() {
        System.out.println("dance");
    }

}
