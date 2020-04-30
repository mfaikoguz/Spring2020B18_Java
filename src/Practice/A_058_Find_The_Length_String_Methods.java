package Practice;

import java.util.Scanner;

public class A_058_Find_The_Length_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = scan.nextLine();

        int length = text.length();
        System.out.println("Length is: " + length);
    }
}
