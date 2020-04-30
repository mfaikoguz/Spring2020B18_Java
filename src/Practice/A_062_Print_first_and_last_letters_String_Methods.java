package Practice;

import java.util.Scanner;

public class A_062_Print_first_and_last_letters_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        System.out.print(first + "" + last);
    }
}
