package Practice;

import java.util.Scanner;

public class A_115_Arrays_Finding_Max_Length_in_String_array_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }

        int max = words[0].length();
        String longest = words[0];

        for (int i = 0; i < 5; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                longest = words[i];
            }
        }
        System.out.println(longest);

    }
}
