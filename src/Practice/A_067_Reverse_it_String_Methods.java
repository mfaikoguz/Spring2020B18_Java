package Practice;

import java.util.Scanner;

public class A_067_Reverse_it_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverse = "";

        if (word.length() == 5){
            reverse = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
            System.out.println(reverse);
        } else if (word.length() < 5){
            System.out.println("Too short!");
        } else {
            System.out.println("Too long!");
        }
    }
}
