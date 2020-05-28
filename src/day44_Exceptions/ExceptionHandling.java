package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str = "Cybertek";

        try {
            System.out.println(str.charAt(100));
        } catch (RuntimeException e) {
            String description = e.getMessage(); // String index out of range: 100
            System.out.println(description);
            // int e = 100;
        }

        System.out.println("=================================");
        String result = "";

        try {
            System.out.println(100 / 0);
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("Catch block");
            result = e.getMessage(); // / by zero

        }

        System.out.println(result);
        System.out.println("Completed");
    }
}
