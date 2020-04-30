package day22_Arrays_Loops;

import java.util.Arrays;

public class Warmup1 {
    public static void main(String[] args) {
        /*
        Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                Must use continue statement
        */

        int[] numbers = new int[100]; // index: 0 ~ 99

        /*
        numbers[0] = 1;
        numbers[1] = 2;
        //...
        numbers[99] = 100;
        */
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        for (int each : numbers) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
            } else {
                continue;
            }

        }


    }
}
