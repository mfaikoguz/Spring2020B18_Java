package day24_Methods;

import java.util.Arrays;

public class ReturnMethods_Pratice {
    /*
    create a functions that can return the maximum number from any given array
    */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 8, 9, 20, 5465, 54, 5, 8, 2};

        int max = maxNumber(arr);
        System.out.println(max);
        
        int min = minNumber(arr);
        System.out.println(min);
    }

    public static int maxNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static int minNumber (int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

}

