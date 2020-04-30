package Practice;

public class A_171_Methods_with_String_6_limit_string {
    public static String limit(String text, int maxLength) {
        String str = text.substring(0, maxLength);
        return str;
    }

    public static void main(String[] args) {
        String result = limit("abcd", 2);
        System.out.println(result);

    }
}