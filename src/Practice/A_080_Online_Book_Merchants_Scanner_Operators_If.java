package Practice;

import java.util.Scanner;

public class A_080_Online_Book_Merchants_Scanner_Operators_If {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a premium customer? (true or false)");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("How many book did you purchase?");
        int nbooksPurchased = scan.nextInt();

        if (isPremiumCustomer && nbooksPurchased >= 8) {
            freeBooks = 2;
        } else if (isPremiumCustomer && nbooksPurchased >= 5){
            freeBooks = 1;
        } else if (!isPremiumCustomer && nbooksPurchased >= 12){
            freeBooks = 2;
        } else if (!isPremiumCustomer && nbooksPurchased >= 7){
            freeBooks = 1;
        }
        System.out.println(freeBooks);

    }
}
