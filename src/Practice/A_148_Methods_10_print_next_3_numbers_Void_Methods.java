package Practice;

import java.util.Scanner;

public class A_148_Methods_10_print_next_3_numbers_Void_Methods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();
        next3(num);
    }

    public static void next3(int num) {
        for (int i = 0; i < 3; i++) {
            num += 1;
            System.out.print(num + " ");
        }

    }
}
