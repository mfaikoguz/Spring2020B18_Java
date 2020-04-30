package Practice;

import java.util.Scanner;

public class A_034_VideoGameCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupons = input.nextInt();

        int costOfCandy=10;
        int costOfGumball=3;
        int candy=coupons/costOfCandy;
        int gumball=coupons%costOfCandy/3;
        if (coupons>3) {
            System.out.println("Number of Candies: " + candy);
            System.out.println("Number of Gumballs: " + gumball);
        } else {
            System.out.println("Not enough coupons");
        }
    }
}
