package Practice;

import java.util.Scanner;

public class A_063_Duplicate_it_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.print(word1 + "" + word2 + "" + word2 + "" + word1);
    }
}
