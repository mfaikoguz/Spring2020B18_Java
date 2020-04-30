package Practice;

import java.util.Scanner;

public class A_101_Arrays_print_first_last_char_I_Loop_Arrays_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        for (String each : words) {
            System.out.println(each.substring(0,1) + each.substring(each.length()-1));
        }
    }
}
