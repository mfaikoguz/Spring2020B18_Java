package Practice;

import java.util.Scanner;

public class A_085_Shopping_list_2_Loop_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue = scan.next();
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            count++;
            totalPrice += price;
        } while (countinue.equalsIgnoreCase("yes") && count <= 10);

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2)); // virgulu siliyo
        System.out.println("Total price: "+totalPrice);
    }
}
