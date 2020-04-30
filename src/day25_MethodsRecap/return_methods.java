package day25_MethodsRecap;

public class return_methods {

    // a, b

    public static int max(int a, int b) {
        int max = 0;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int max2(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int maximum = max(10,2); // 1st method
        System.out.println(maximum);

        int maximum2 = max2(10,2); // 2nd method
        System.out.println(maximum2);
    }
}
