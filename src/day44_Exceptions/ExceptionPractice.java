package day44_Exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            System.out.println("Merhaba");
            System.out.println(9 / 0);
            System.out.println("Hola"); // doesn't print because we jump to catch block as soon as find the exception
        } catch (Exception e) {
            System.out.println("Catch");
        }
    }
}
