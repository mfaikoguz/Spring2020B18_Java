package Practice;

import java.util.Scanner;

public class A_106_Arrays_Split_Sentence_Loop_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");
        for (String each : arr) {
            System.out.println(each);
        }
    }
}
