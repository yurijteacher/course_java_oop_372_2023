package unit8.calculation;

public interface Calculation {

    final double c = 0;

    double add(double a, double b);

    double sub(double a, double b);

    default double mul(double a, double b){
        return a * b;
    }


    static double div(double a, double b){
//        double c = 0;
//        if(b>0){
//            c = a/b;
//        }
//        return c;
//
//        c = (b>0) ? a/b : 0;
//

        return (b>0) ? a/b : 0;
    }



}
