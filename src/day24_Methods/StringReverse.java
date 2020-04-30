package day24_Methods;

public class StringReverse {
    public static void main(String[] args) {
        Reverse("Mehmet Faik Oguz");

        String t = Reverse2("Mehmet Faik Oguz");
        System.out.println(t);
    }

    public static void Reverse(String str) { // ABCD
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String Reverse2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
