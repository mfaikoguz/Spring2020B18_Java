package Practice;

import java.util.Scanner;

public class A_079_String_no_end_String_method {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        String word = txt.substring(0,txt.length()-1);
        System.out.println(word);
    }
}
