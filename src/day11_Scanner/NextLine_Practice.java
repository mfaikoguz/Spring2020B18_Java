package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 21 + Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); // Enter will be assigned to this one, so won't be able to input anything here

        System.out.println("Your age is: " + age);
        System.out.println("Your full name is: " + fullName);

    }
}
