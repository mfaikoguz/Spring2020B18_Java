package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class A_154_Methods_16_Check_if_number_is_palindrome_Void_Methods {
    /*
    Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        String text = "" + num; //  int converted to String
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        boolean result = text.equals(reversed);
        System.out.println(result);
    }


}