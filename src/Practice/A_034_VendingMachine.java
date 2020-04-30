package Practice;

import java.util.Scanner;

public class A_034_VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price in cents:");
        int itemPrice = input.nextInt();

        int quarters, dimes, nickels, exchange;

        exchange = 100 - itemPrice;

        quarters = exchange / 25;
        exchange = exchange % 25;

        dimes = exchange / 10;
        exchange = exchange % 10;

        nickels = exchange / 5;
        exchange = exchange % 5;

        if (itemPrice < 25 || itemPrice > 100) {
            System.out.println("Invalid price!");
        } else if (itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
        } else {
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        }
    }
}
