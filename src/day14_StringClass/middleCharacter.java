package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next(); // Cyber
                                    // 01234

        String middleCharacter = ""; // to store the middle characters at the end
        int totalCharacters = word.length(); // 5
        int middleNumber = totalCharacters / 2; // 5/2 ==> 2

        if (totalCharacters % 2 !=0) { // odd
            middleCharacter = middleCharacter + word.charAt(middleNumber);
        } else { // even
            middleCharacter = middleCharacter + word.charAt(middleNumber -1) + word.charAt(middleNumber);
        }
        System.out.println(middleCharacter);




    }
}
