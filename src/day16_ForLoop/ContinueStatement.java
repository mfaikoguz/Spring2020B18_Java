package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // 1, 2, 3, 4, 5
            if (i == 3) {
                continue; // this continue condition skips i = 3 // output: 1 2 4 5
            }
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; // skips all the odd numbers
            }
            System.out.print(i + " ");
        }
    }
}
