package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int[] arr1 = {10, 19, 5, 2, 3, 4, 5, -1, 300};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: " + arr1[0]);
        System.out.println("Second min number is: " + arr1[1]);

        System.out.println("First max number is: " + arr1[arr1.length - 1]);
        System.out.println("Second max number is: " + arr1[arr1.length - 2]);

        System.out.println("====================================");

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        System.out.println("====================================");

        int[] arr = {3, 1, 4, -1, 100, -100, 200, 155};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] arrDesc = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            // System.out.print(arr[i] + " "); // descending order
            arrDesc[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arrDesc)); // descending order

        String[] names = {"Deniz", "Osman", "Rustem", "Anna", "Ali", "Adil"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


    }
}
