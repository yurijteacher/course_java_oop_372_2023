package unit7;

public class ClockExt extends Clock {
    private int second = 0;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public ClockExt() {
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public void nextSecond(){
        second++;
        if(second>59){
            nextMinute();
            second = 0;
        }

    }


    @Override
    public String toString() {
        return "ClockExt{" +
                "hour=" + getHour() + "," +
                "minute=" + getMinute() + "," +
                "second=" + second +
                '}';
    }
}
