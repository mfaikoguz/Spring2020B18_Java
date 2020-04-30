package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        byte a = 4;
        float a1 = 4.5F;
        long a2 = 10L;
        double a3 = 2.5D;
        boolean a4 = true;

        // cant use long double float boolean for switch

        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Invalid Case");
                break;
        }
    }
}
