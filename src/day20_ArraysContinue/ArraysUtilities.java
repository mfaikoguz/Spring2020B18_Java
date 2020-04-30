package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr); // Logic Error

        String r = Arrays.toString(arr); // converts array to String. Returns String.
        System.out.println(r);

        System.out.println("==============================");

        String names[] = {"Mehmet", "Faik", "Oguz"};
        System.out.println(names); // Not readable. Logic Error

        System.out.println(Arrays.toString(names));

        System.out.println("==============================");

        double[] nums = {10, 20, 30, 40, 50};
        System.out.println(nums); // Logic Error

        System.out.println(Arrays.toString(nums));

        System.out.println((int)nums[0]); // converts double data to int
        System.out.println(nums[0] + 1); // not concatenation. Result = 11.0
    }
}
