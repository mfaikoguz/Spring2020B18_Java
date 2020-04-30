package day24_Methods;

import java.util.Scanner;

public class BirthYear {
    public static void Age(int birthYear) { // 2020 - 1999
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int currentYear = scan.nextInt();

        int age = currentYear - birthYear;

        if (age > 0 && birthYear > 1900) {
            System.out.println(age);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        int a = 1919;

        Age(a); // both works
        Age(1999); // both works
    }
}
