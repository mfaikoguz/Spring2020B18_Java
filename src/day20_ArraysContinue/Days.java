package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};  // size: 7,  max index: 6

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();  // 6

        while (num > 7 || num < 1) {
            System.out.println("Invalid Entry, Please re-enter the number");
            num = input.nextInt();

        }


        String result = days[num - 1];

        System.out.println(result);
    }
}
