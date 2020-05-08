package day35_Static;

import java.util.Scanner;

public class staticPractice {
    // when to use static variable instead of instance variable
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        System.out.println("Sum is: " + (num1 + num2));
    }

    public void method1() { // not a static method, instance method
        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        System.out.println("Multiplication is: " + (num1 * num2));

    }
}
