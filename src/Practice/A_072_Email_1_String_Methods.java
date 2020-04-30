package Practice;

import java.util.Scanner;

public class A_072_Email_1_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = "";
        String lastName = "";
        String extra = "";

        if (email.contains("_")) {
            lastName = email.substring(0, email.indexOf("_"));
            firstName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            extra = email.substring(email.indexOf("@"));
            lastName = firstName.concat("_").concat(lastName).concat(extra);
            System.out.println(lastName);
        } else {
            System.out.println(email);
        }
    }
}
