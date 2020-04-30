package Practice;

import java.util.Scanner;

public class A_109_Arrays_printing_01_Loop_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        for (String each : arr) {
            System.out.println(each.substring(0,3));
        }
    }
}
