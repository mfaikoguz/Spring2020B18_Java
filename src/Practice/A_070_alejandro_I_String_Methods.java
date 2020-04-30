package Practice;

import java.util.Scanner;

public class A_070_alejandro_I_String_Methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if (a.contains("alejandro")) {
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }
    }
}
