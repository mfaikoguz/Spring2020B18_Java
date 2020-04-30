package Practice;

import java.util.Scanner;

public class A_092_Factorial_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long multiplier = 1;

        for (long i = 1; i <= n; i++) {
            multiplier *= i;
        }
        System.out.println(multiplier);
    }
}
