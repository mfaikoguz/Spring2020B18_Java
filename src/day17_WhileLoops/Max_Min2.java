package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min2 {
    public static void main(String[] args) {
        /*2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement

         */

        Scanner input = new Scanner(System.in);
        int minNumber = 999999999; // any number user provides will be less than this number

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num < minNumber){
                minNumber = num;
            }
        }
        System.out.println(minNumber);
    }
}
