package Practice;

import java.util.Scanner;

public class A_084_Zombie_Attack_1_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count = 0;
        int result = 0;
        String day = "";

        for (int i = inhabitants; i >= 0; i--) {
            result = inhabitants;
            inhabitants /= 2;
            day = "Day " + count;
            count++;
            if (result == 0) {
                break;
            }
            System.out.println(day + " [" + result + "]");
        }
        System.out.println("---- EXTINCT ----");

    }
}

