package Practice;

import java.util.Scanner;

public class A_064_Middle_One_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length() > 1){
        int middle = word.length() / 2;
        char middleLetter = word.charAt(middle);
        char MiddleLetterForEven = word.charAt((word.length() / 2) -1);


        if (word.length() >= 3 && word.length() % 2 != 0) {
            System.out.println(middleLetter);
        } else if (word.length() >= 4 && word.length() % 2 == 0) {
            System.out.println(MiddleLetterForEven + "" + middleLetter);
        } else if (word.length() == 2) {
            System.out.println(word + "" + word);
        }
        } else {
            System.out.println(word + "" + word + "" + word);
        }

    }
}
