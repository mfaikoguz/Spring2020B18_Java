package Practice;

import java.util.Scanner;

public class A_139_Methods_1_simple_calculator_Void_Methods {
    public static void main(String[] args) {
        plus();
    }

    public static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("enter second number:");
        int secondNumber = input.nextInt();

        System.out.println("result: " + (firstNumber + secondNumber));

    }
}
