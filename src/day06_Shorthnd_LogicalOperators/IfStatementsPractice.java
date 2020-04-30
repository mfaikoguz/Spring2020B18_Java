package day06_Shorthnd_LogicalOperators;

public class IfStatementsPractice {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        if(a > b) {
            System.out.println(a + " is greater than " + b);
        }

        if (b > a) {
            System.out.println(b + " is greater than " + a);
        }

        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
    }
}
