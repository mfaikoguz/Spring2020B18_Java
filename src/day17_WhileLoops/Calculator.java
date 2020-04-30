package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
				1. enter first number
				2. enter the second number
				3. enter the math operators
					(assume that only the +, -, *, /, and % will be entered)
					then the system will give the result based on the operator
					at the end it will ask if the user want's to calculate another numbers, if user
					entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
						(you will need a lop that has true condition without the iterator)
         */

        Scanner input = new Scanner(System.in);

        for (int i = 0; i == 0; ) {
            System.out.println("Enter the first number:");
            int num1 = input.nextInt();
            System.out.println("Enter the second number:");
            int num2 = input.nextInt();
            System.out.println("Enter the operator:");
            char operator = input.next().charAt(0); // +, - , *, /, %

            if (operator == '+') {
                System.out.println(num1 + num2);
            } else if (operator == '-') {
                System.out.println(num1 - num2);
            } else if (operator == '*') {
                System.out.println(num1 * num2);
            } else if (operator == '/') {
                System.out.println(num1 / num2);
            } else if (operator == '%') {
                System.out.println(num1 % num2);
            } else {
                System.out.println("Invalid operator");
            }

            System.out.println("Do you wanna continue");
            String answer = input.next();
            if (answer.equalsIgnoreCase("yes")){
                System.out.println("ok");
            } else if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }


    }
}
