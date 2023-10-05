package unit3;

import java.util.Arrays;
import java.util.List;

public class MyArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        System.out.println(Arrays.toString(arr1));

       // arr1[3] = 4;

        int[][] arr2 = {{1,2,3,4,},{5,6,7,8}};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] +",");
            }
            System.out.println();
        }


        List arr3 = List.of(1,2,3,4,3);
        System.out.println(arr3);

        // arr3.add(3);


    }


}
