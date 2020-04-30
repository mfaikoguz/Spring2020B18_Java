package Practice;

import java.util.Scanner;

public class A_069_Print_half_twice_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String middle = word.substring(0,word.length() / 2);
        System.out.println(middle + "" + middle);

    }
}
