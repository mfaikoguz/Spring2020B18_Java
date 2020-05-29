package day45_Exceptions;

public class ThrowsKeyword3 {
    public static void method1() throws Exception {
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws Exception {
        method1();
    }
}
