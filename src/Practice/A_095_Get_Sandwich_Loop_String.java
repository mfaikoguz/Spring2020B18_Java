package Practice;

import java.util.Scanner;

public class A_095_Get_Sandwich_Loop_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int numBread = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equalsIgnoreCase("bread")) {
                numBread++;
            }
        }
        if (numBread >= 2) {
            System.out.println(str.substring(str.indexOf("d") + 1, str.lastIndexOf("bread")));
        } else {
            System.out.println("nothing");
        }
    }
}