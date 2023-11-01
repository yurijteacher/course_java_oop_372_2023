package unit7;

public class ClockExt2 extends ClockExt {

    private int ms = 0;

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public ClockExt2() {
    }

    public ClockExt2(int hour, int minute, int second, int ms) {
        super(hour, minute, second);
        this.ms = ms;
    }

    public void nextMs(){
        // + 100 ms
        ms+=100;

        if(ms>900){
            nextSecond();
            ms=0;
        }
    }


    @Override
    public String toString() {
        return "ClockExt2{" +
                "hour=" + getHour() +     "," +
                "minute=" + getMinute() + "," +
                "second=" + getSecond() + "," +
                "ms=" + ms +
                '}';
    }
}
