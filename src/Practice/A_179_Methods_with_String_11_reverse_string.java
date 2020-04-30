package Practice;

public class A_179_Methods_with_String_11_reverse_string {
    public static String reverse(String input) {
        int j = 0;
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
            j++;
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = reverse("foo");
        System.out.println(str);
    }
}
