package Practice;

import java.util.Scanner;

public class A_065_Middle_three_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() > 1) {

            int middle = word.length() / 2;
            char first = word.charAt(middle - 1);
            char second = word.charAt(middle);
            char third = word.charAt(middle + 1);

            if (word.length() >= 5 && word.length() % 2 != 0) {
                System.out.print(first + "" + second + "" + third);
            } else {
                System.out.println("invalid");
            }
        } else {
            System.out.println("invalid");
        }
    }
}
