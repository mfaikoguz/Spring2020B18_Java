package day24_Methods;

import java.util.Scanner;

public class Warmups {
        /*
        1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
    	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
    	3. write a method that can identify if a string is palindrome
			ex: palindrome("level")  ==> true
				palindrome("Cybertek") ==> false
        */


    //      1
    public static void Max(int num1, int num2) {
        if (num1 >= num2) {
            System.out.println("Maximum number is: " + num1);
        } else {
            System.out.println("Maximum number is: " + num2);
        }
    }

    // 2
    //                                 10            20            *
    public static void Calculation(double num1, double num2, char operator) {
        switch (operator) {
            case '*':
                System.out.println(num1 * num2);
                break;
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("invalid");
        }
    }

    // 3
    public static void Palindrome(String str) {
        str = str.toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(str.equals(reversed));

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Max(a, b);

        Calculation(10, 20, '*');
        Calculation(a, b, '+');

        Palindrome("Level");

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1");
            int num1 = scan.nextInt();
            System.out.println("Enter num2");
            int num2 = scan.nextInt();
            System.out.println("Enter operator");
            char operator = scan.next().charAt(0);

            Calculation(num1, num2, operator);
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry. Please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }

    }

}
