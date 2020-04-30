package Practice;

import java.util.Scanner;

public class A_151_Methods_14_Print_unique_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}