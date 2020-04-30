package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /*
        ask the user to enter yes or no
            if the user enters other than yes or no, repeat the previous step
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Yes or No");
        String word = input.next();
        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");

        while (!valid) {
            System.out.println("please re-enter");
            word = input.next();

            if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")) {
                break;
            }
        }

        if (word.equalsIgnoreCase("yes")) {
            System.out.println("You entered yes");
        } else if (word.equalsIgnoreCase("no")) {
            System.out.println("You entered no");
        }

    }
}
