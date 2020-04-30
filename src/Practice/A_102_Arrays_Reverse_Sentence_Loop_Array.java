package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class A_102_Arrays_Reverse_Sentence_Loop_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] arr = sentence.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}