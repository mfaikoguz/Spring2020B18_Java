package Practice;

import java.util.Scanner;

public class A_083_Party_Loop_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String list = "";

        do {
            System.out.println("Please enter guest name:");
            name = input.next();
            list += name + ", ";
            System.out.println("Do you want to enter new guest name:");
            name = input.next();
        } while (name.equalsIgnoreCase("Yes"));
        if (name.equalsIgnoreCase("No")) {
            list = list.substring(0, list.length() - 2);
            System.out.println("Guest's list: " + list);
        }
    }
}
