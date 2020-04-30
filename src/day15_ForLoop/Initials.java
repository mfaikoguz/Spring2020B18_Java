package day15_ForLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB

         */

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        // String initials = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();
        // initials = initials.toUpperCase();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);
        initials = initials.toUpperCase();

        System.out.println(initials);
    }
}
