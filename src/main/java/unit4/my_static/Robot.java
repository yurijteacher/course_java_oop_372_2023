package unit4.my_static;

public class Robot {

    public static final int a = 5;
    public static double x = 10.5;
    public static double y = 20.5;

    public static double add(double x1, double y1){
     return  x1+y1;
    }

    public static void print(){
        System.out.println(x + "," + y);
    }

    public static void main(String[] args) {

        System.out.println(add(10,15));
        // a = 10;
        System.out.println(5);

        print();

    }

}
