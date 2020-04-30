package Practice;

import java.util.Scanner;

public class A_110_Print_n_times_Loop {
    public static void main(String[] args) {
        int j = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (j = n; j > 0; j--) {
            System.out.print("*");
        }
    }
}
