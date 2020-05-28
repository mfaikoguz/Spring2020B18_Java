package Practice2;

import java.util.Arrays;

public class populateArray {
    public static int[] populate(int[] r) {
        int[] arr = new int[r.length];

        for (int i = 0; i < r.length; i++) {

            arr[i] = i + 1;
        }


        return arr;
    }

    public static void main(String[] args) {


        int[] i = new int[3];
        i = populate(i);
        System.out.println(Arrays.toString(i));

    }
}