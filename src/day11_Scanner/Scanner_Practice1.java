package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        /*
        1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();
        System.out.println("Are you employed (true ==> employed, false ==> unemployed): ");
        boolean employment = input.nextBoolean();

        double salary = 0;

        if (employment) {
            System.out.println("Employed");
            System.out.println("What's your salary: ");
            salary = input.nextDouble();
        } else {
            System.out.println("Unemployed");
            salary = 0;
        }

        System.out.println("Your name: " + firstName + " " + lastName);
        System.out.println("Your employment status: " + employment);
        System.out.println("Your salary: $" + salary);

        input.close(); // closes scanner

    }
}
