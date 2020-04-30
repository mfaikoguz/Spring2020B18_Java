package day26_MethodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {
        int sum = sum(1,2,3,4);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
