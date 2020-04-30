package day26_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        method(10); // original method
        method(20.0); // overloaded method
    }
    public static void method(int a) {
        System.out.println("Original Method");

    }

    public static void method(double a) { // should be different dataType or number of parameters
        System.out.println("Overloaded Method");
    }
}