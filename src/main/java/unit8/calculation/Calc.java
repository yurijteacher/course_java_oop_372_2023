package unit8.calculation;

public class Calc implements Calculation, Information{
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public void info() {
        System.out.println("information");
    }
}
