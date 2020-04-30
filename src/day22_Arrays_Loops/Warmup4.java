package day22_Arrays_Loops;

import java.util.Arrays;

public class Warmup4 {
    public static void main(String[] args) {
        /*
        2. write a program that sort the array in descending order
        */

        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr); // ascending

        int j = arr.length - 1;

        int revArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(revArr)); // descending
    }
}
