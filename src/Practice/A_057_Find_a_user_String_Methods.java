package Practice;

import java.util.Scanner;

public class A_057_Find_a_user_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = scan.nextLine();
        boolean user = fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake");
        if (user) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }
    }
}
