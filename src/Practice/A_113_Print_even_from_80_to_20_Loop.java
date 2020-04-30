package Practice;

public class A_113_Print_even_from_80_to_20_Loop {
    public static void main(String[] args) {
        int[] arr = new int[31];

        for (int i = 80; i >= 20; i--) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
