package day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10 / 3;
        System.out.println(a); // not 3.33333
        double b = 10 / 3;
        System.out.println(b); // still not 3.33333
        double c = 10 / 3.0;
        System.out.println(c); // now it's 3.33333

        double d = 300L;
        float f = 200L;
        int i = 100;
        int u = 10;
        double p = 20;
        short y = (short) 5L;
        long l = 10L;



    }
}
