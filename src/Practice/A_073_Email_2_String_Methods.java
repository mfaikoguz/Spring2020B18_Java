package Practice;

import java.util.Scanner;

public class A_073_Email_2_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = email.substring(0, email.indexOf("_"));
        String FirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String LastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String Domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        String TopLevelDomain = email.substring(email.indexOf(".") + 1);
        System.out.println("First name: " + FirstName);
        System.out.println("Last name: " + LastName);
        System.out.println("Domain: " + Domain);
        System.out.println("Top-Level Domain: " + TopLevelDomain);
    }
}
