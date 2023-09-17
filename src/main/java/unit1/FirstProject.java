package unit1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstProject {
    //    public static void main(String[] sad){
    //    }

    static int a1 = 10;
    static int a2 = 1;


    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static int sub(int a, int b) {
//        int c = a - b;
//        return c;
        return a - b;
    }

    public static void print(int a) {
        System.out.println(a);
    }
    // psvm

    public static void main(String[] args) {
        // sout
        System.out.println("Hello!!!");
        String text = "World!!!";

        text = "Hello World!!!";

        char ch = 'a';
        char[] text1 = text.toCharArray();

        boolean logic = false;

        byte b = 5;
        short s = 3;
        int i = 5;
        long l = 5L;
        float f = 5.04f;
        double d = 34;
        // 0 1 2 3 4
        int[] array1 = {1, 2, 3, 4, 5,};

        // for
        for (int j = 0; j < array1.length; j++) {
            System.out.println(array1[j]);
        }

        int j = 0;

        for (; j < array1.length; ) {
            System.out.print(array1[j] + ",");
            j++;
        }

        System.out.println("\n");
        j = 0;

        // while
        while (j < array1.length) {
            System.out.print(array1[j] + ",");
            j++;
        }

        System.out.println("\n");

        // do-while
        j = 0;
        do {
            System.out.print(array1[j] + ",");
            j++;
        } while (j < array1.length);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // v.7
        for (Integer el : list) {
            System.out.println(el);
        }


        Arrays.toString(array1);

        // v.8 Stream
//        Stream.of(array1).forEach(el->{
//            System.out.println(el);
//        });


        b = 10;

        add(4, 5);
        print(sub(5, 4));
        print(sub(a1, a2));
    }

}
