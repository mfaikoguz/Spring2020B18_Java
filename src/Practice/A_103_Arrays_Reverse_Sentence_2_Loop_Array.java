package Practice;

import java.util.Scanner;

public class A_103_Arrays_Reverse_Sentence_2_Loop_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";

        String[] arr = sentence.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i] + " ";
        }

        reversed = reversed.substring(0, reversed.length() - 1);


        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
