package day24_Methods;

public class ReturnMethods {
    public static void maxNum(int a, int b) {
        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        // int a = maxNum(10, 20);
        int result = Addition(10, 20);
        System.out.println(result);
    }

    public static int Addition(int a, int b) {
        // System.out.println(a + b);
        return a + b;
    }
}
