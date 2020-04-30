package Practice;

import java.util.Arrays;

public class A_176_Method_Overloading_1 {
    public static int findMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static double findMax(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }


}
