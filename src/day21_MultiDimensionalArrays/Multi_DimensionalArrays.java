package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}};
        //                      0         1

        System.out.println(arr2D.length); // 2

        int[] arr1D = arr2D[0]; // {1, 2, 3}
        System.out.println(Arrays.toString(arr1D));

        int num1 = arr2D[1][3];
        System.out.println(num1); // 7

        //                 0    1      0    1    2      0    1    2    3    4
        char[][] ch2D = {{'A', 'B'}, {'D', 'E', 'F'}, {'G', 'H', 'I', 'J', 'K'}};
        //index:             0              1                     2

        char c1 = ch2D[1][1]; // E
        System.out.println(c1);

        char[] ch1D = ch2D[2]; // GHIJK
        System.out.println(Arrays.toString(ch1D)); // ? no need to do this?


    }
}
