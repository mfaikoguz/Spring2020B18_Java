package day16_ForLoop;

public class EnglishAlphabet {
    public static void main(String[] args) {
        /*
        5. Write a program that will print out all letters in English alphabet in ascending order
	    6. Write a program that will print out all letters in English alphabet in descending order
         */

        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch + " ");
        }

        System.out.println();


        for (char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch + " ");
        }
    }
}
