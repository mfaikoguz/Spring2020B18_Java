package Practice;

import java.util.Scanner;

public class A_035_Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        boolean equal = word1.equals(word2);

        if (equal) {
            System.out.println("word1 equals word2");
        } else {
            System.out.println("word1 does not equal word2");
        }
    }
}
