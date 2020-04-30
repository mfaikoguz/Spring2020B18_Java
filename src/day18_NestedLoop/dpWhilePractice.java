package day18_NestedLoop;

public class dpWhilePractice {
    public static void main(String[] args) {
        /*
        print all the even numbers in the same line separated by space
         */

        int num = 0;

        do {
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 100);

        System.out.println();
        System.out.println("=======================");

        int i = 1;
        do {
            i++; // iterator before the print statement so it increases first then prints
            System.out.println(i);
        } while (i <= 5);

        System.out.println("=======================");

        int y = 1; // 3
        do {
            if (y == 3){
                y++; // need to make sure iterator is not skipping
                continue;
            }
            System.out.println(y);
            y++;
        } while (y <= 5);
    }
}
