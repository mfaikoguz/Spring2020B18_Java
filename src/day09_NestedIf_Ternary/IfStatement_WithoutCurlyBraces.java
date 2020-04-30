package day09_NestedIf_Ternary;

public class IfStatement_WithoutCurlyBraces {
    public static void main(String[] args) {

        int number = 100;

        if (number % 2 == 0)
            System.out.println("Even Number"); // one line of statement so we can delete curly braces
        else
            System.out.println("Odd Number");  // one line of statement so we can delete curly braces

        if (9 < 8)
            System.out.println("Hello");
            System.out.println("Condition is true"); // line 15 and 16 gets executed no matter what
            System.out.println("Test executed"); // bc if statement doesn't have curly braces.
    }
}
