package Practice;

import java.util.Scanner;

public class A_145_Methods_7_plus_minus_Void_Methods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        System.out.println("positives:" + countPositive + ", negatives:" + countNegative + ", zeros:" + countZero);
    }
}
