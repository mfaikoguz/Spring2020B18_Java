package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        /*
        username = Cybertek
        password= cybertekschool
         */
        String validUsername = "Cybertek";
        String validPassword = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUsername = input.next();

        System.out.println("Enter your password");
        String inputPassword = input.next();

        if (inputUsername.equals(validUsername) && inputPassword.equals(validPassword)) {
            System.out.println("You logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
