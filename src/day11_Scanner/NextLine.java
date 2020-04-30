package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String str = input.nextLine(); //nextLine() accepts enter without typing anything else.

        System.out.println(str);
    }
}
