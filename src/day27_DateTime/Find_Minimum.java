package day27_DateTime;

public class Find_Minimum {
    /*

     */
    public static void main(String[] args) {
        int[] arr2 = {100, 2000, 3000, 40, 50, -100, -9000};
        System.out.println(minimum(arr2));
    }

    public static int minimum(int[] arr) {
        int minimum = arr[0];
        for (int each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }
}
