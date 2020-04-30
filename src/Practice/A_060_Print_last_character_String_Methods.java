package Practice;

import java.util.Scanner;

public class A_060_Print_last_character_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.substring(word.length() - 1));
    }
}
