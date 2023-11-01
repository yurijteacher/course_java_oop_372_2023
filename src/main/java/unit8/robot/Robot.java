package unit8.robot;

import unit8.calculation.Information;

public abstract class Robot implements Hand, Head, Leg, Information {

    private Head head;
    private Leg leg;
    private Hand hand;

    abstract void dance();
    public Robot() {}

    public Robot(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head +
                ", leg=" + leg +
                ", hand=" + hand +
                '}';
    }
}
