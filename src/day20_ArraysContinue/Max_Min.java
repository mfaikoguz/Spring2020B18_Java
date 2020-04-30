package day20_ArraysContinue;

public class Max_Min {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int lastIndex = arr.length - 1;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= lastIndex; i++) {
            if (arr[i] > max) { // array's index are compared to each other, and whichever is greater will be assigned to the max
                max = arr[i];
            }
            if (arr[i] < max) { // array's index are compared to each other, and whichever is smaller will be assigned to the max
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
