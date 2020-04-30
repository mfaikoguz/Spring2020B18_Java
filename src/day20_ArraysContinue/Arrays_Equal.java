package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Equal {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean result1 = Arrays.equals(arr1, arr2);

        System.out.println(result1); // true

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {3, 2, 1};

        boolean result2 = Arrays.equals(arr3, arr4);

        System.out.println(result2); // false, order is different

        int[] arr5 = {1, 2, 3};
        int[] arr6 = {3, 2, 1};

        Arrays.sort(arr5); // [1, 2, 3]
        Arrays.sort(arr6); // [1, 2, 3]
        boolean result3 = Arrays.equals(arr5,arr6);

        System.out.println(result3); // true, because we sorted before the print statement

    }
}
