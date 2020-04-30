package Practice;

import java.util.Scanner;

public class A_141_Methods_3_find_cube_Void_Methods {
    public static void cube() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(number * number * number);
    }

    public static void main(String[] args) {
        cube();
    }
}
