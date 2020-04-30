package day26_MethodOverloading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        sum(10, 20);
        sum(10.0, 20.0);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }
}
