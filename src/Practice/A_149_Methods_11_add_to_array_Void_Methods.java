package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class A_149_Methods_11_add_to_array_Void_Methods {
    public static void add_to_r(int[] r, int n) {
        //create new array with one more position.
        int[] arr = new int[r.length + 1];
        for (int i = 0; i < r.length + 1; i++) {
            if (i == r.length) {
                arr[r.length] = n;
                continue;
            }
            arr[i] = r[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        add_to_r(arr, n);


    }
}
