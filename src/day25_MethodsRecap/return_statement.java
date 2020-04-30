package day25_MethodsRecap;

public class return_statement {
    public static void main(String[] args) {
        /*
        if (10 > 9) {
            return; // exits the current method only
        }

        System.out.println("Hello");
        */

        method1();

        System.out.println("Hello"); // prints
    }

    public static void method1() {
        if (10 > 9) {
            return; // exits this method
        }

        System.out.println("Hello Cybertek");
    }
}