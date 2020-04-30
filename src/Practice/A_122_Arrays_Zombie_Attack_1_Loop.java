package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class A_122_Arrays_Zombie_Attack_1_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int[] arr = new int[inhabitants.length];
        int j = 0;
        System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
        while (!Arrays.equals(inhabitants, arr)) {
            j++;
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] % 2 == 0) {
                    inhabitants[i] /= 2;
                } else {
                    inhabitants[i] = (inhabitants[i] - 1) / 2;
                }
            }
            System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");
    }
}
