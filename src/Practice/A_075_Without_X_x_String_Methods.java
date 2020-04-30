package Practice;

import java.util.Scanner;

public class A_075_Without_X_x_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";
        String f = "" + word.charAt(0);
        String l = "" + word.charAt(word.length() - 1);

        if (f.equalsIgnoreCase("X") && l.equalsIgnoreCase("X")) {
            result = word.substring(1, word.length() - 1);
        } else if (f.equalsIgnoreCase("X")) {
            result = word.substring(1);
        } else if (l.equalsIgnoreCase("X")) {
            result = word.substring(0, word.length() - 1);
        } else {
            result = word;
        }
        System.out.println(result);
    }
}
