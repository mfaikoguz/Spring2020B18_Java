package Practice;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }
        int count = 0;
        int j = 128;
        for (int each : binary) {
            if (each == 1) {
                count += j;
            }
            j /= 2;
        }
        System.out.println(count);

    }
}