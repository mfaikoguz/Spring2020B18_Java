package Practice;

import java.util.Scanner;

public class A_071_alejandro_II_String_Methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if (a.contains("alejandro") && a.contains("project")) {
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }
    }
}
