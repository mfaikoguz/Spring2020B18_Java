package Practice;

import java.util.Scanner;

public class A_060_Verify_contains_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean contain = sentence.contains(word);
        System.out.println(contain);
    }
}
