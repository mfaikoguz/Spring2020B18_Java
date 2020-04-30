package Practice;

import java.util.Scanner;

public class A_059_Print_first_character_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstCharacter = word.charAt(0);
        System.out.println(firstCharacter);


    }
}
