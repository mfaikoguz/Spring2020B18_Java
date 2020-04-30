package Practice;

public class A_156_Methods_with_return_1_count_appearance {
    public static int count_appearance(String[] arr, String t) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (t.equalsIgnoreCase(arr[i])) {
                count++;
            }
        }
        return count;
    }
}
