package Practice;

import java.util.Scanner;

public class Assessment_test_5_2_Odd_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();

        if (num1 % 2 == 0) {
            num1++;
        }
        while (num1 <= num2) {
            System.out.print(num1 + " ");
            num1 += 2;
        }
    }
}
