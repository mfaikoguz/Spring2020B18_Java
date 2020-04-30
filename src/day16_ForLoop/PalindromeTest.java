package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = scan.nextLine(); // Java
                                       // 0123

        String reverseWord = "";

        for (int i = word.length()-1; i >= 0; i--){
            reverseWord += word.charAt(i);
        }
        boolean palindrome = word.equalsIgnoreCase(reverseWord);

        System.out.println(palindrome);
    }
}
