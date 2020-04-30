package Practice;

public class A_143_Methods_5_simple_print_pattern_Void_Methods {
    public static void printHollowRect() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            count++;
            if (count == 1 || count == 5) {
                System.out.println("*****");
            } else {
                for (int j = 0; j < 1; j++) {
                    System.out.println("*   *");
                }
            }

        }
    }

    public static void main(String[] args) {
        printHollowRect();
    }
}