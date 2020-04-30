package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        /*1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will need for loop and if statement

         */

        Scanner input = new Scanner(System.in);
        int maxNumber = -999999999; // any number user provides will be greater than this number

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > maxNumber){
                maxNumber = num;
            }
        }
        System.out.println(maxNumber);



    }
}
