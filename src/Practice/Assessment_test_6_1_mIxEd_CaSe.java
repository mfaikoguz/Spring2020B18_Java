package Practice;

import java.util.Scanner;

public class Assessment_test_6_1_mIxEd_CaSe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        s = s.toLowerCase();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                res += s.substring(i, i + 1).toLowerCase();
            } else {
                res += s.substring(i, i + 1).toUpperCase();
            }
        }
        System.out.println(res);
    }
}