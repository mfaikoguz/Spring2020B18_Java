package Practice;

public class A_170_Methods_with_String_5_clean_string {
    public static String clean (String text ,String badWord) {
        if (text.contains(badWord)) {
            String str = text.replace(badWord, "");
            return str;
        } else {
            return text;
        }

    }

    public static void main(String[] args) {
        String str = clean("foo bar come", "bar");
        System.out.println(str);
    }
}
