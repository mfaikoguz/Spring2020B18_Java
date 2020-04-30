package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*
        print odd numbers between 1 to 100 in a single line separated by a space
         */

        for (int i = 1; i <= 100; i+= 2){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int k = 0; k <= 100; k += 2){
            System.out.print(k + " ");
        }
    }
}



