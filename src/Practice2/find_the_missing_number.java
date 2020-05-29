package Practice2;

import java.util.Arrays;

public class find_the_missing_number {
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] arr) {
        int sum = 0;
        int sumExpected = 55;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sumExpected - sum;
    }

}
