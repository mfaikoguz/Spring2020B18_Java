package Practice;

import java.util.Scanner;

public class A_045_burger_or_chicken_String_methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String in = s.next();
        boolean burgerChicken = in.equalsIgnoreCase("burger") || in.equalsIgnoreCase("chicken");
        boolean soda = in.equalsIgnoreCase("soda");

        if (burgerChicken) {
            System.out.println("10.0");
        }
        if (soda) {
            System.out.println("2.0");
        }

    }
}
