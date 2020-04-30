package Practice;

import java.util.Scanner;

public class A_086_Cats_and_Dogs_Loop_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        word.toLowerCase();

        while (word.contains("cat") || (word.contains("dog"))){
            if (word.contains("cat")){
                word=word.replaceFirst("cat", "");
                countOfCats++;
            } else if (word.contains("dog")) {
                word = word.replaceFirst("dog", "");
                countOfDogs++;
            }
        }
        System.out.println(countOfCats == countOfDogs);
    }
}
