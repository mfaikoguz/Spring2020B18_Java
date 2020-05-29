package day45_Exceptions;

public class throws_keyword {

    public static void sleep1() {
        try {

            Thread.sleep(3000);
        } catch (Exception e) {

        }
    } // not easy to read

    public static void sleep2() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Cybertek");
        sleep1();
        System.out.println("Java");
        sleep2(); // the caller method has to handle the exception again by adding throws keyword in the method
        System.out.println("Faik");
    }

    public static void method1() throws Exception {
        String[] arr = {"A"};
        main(arr);
    }

    public static void method2() {
        try {
            method1();
        } catch (Exception e) {

        }
    }

    public static void method3() {
        method2(); // doesn't give compile error because the exception have been handled
        // method1(); // gives compile error because handling the exception in method1 was temporary
    }
}
