package day22_Arrays_Loops;

public class NestedLoop {
    public static void main(String[] args) {
//                          0    1      0    1    2      0    1    2    3
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H', 'I'}};
        //                     0              1                 2


        // arr2D[0] ==> {'A', 'B'}
        for (int i = 0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0][i]);
        }

        // arr2D[1] ==> {'C', 'D', 'E'}
        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);
        }

        // arr2D[2] ==> {'F', 'J', 'H', 'I'}
        for (int i = 0; i < arr2D[2].length; i++) {
            System.out.println(arr2D[2][i]);
        }

        System.out.println("========================================");
        for (int j = 0; j < arr2D.length; j++) { // putting j means we want to print 0,1,2 indexes on arr2D / arr2D[0],arr2D[1],arr2D[2]
            for (int i = 0; i < arr2D[j].length; i++) {  // i represents number elements in 1D array
                System.out.println(arr2D[j][i]);
            }
        }
    }
}