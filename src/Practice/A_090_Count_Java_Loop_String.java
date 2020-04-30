package Practice;

import java.util.Scanner;

public class A_090_Count_Java_Loop_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        String wordLowerCase = word.toLowerCase();

        while (word.contains("java")) {
            word = word.replaceFirst("java", "");
            count++;
        }
        System.out.println(count);
    }
}