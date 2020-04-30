package Practice;

public class A_186_Methods_with_String_12_extract_number_from_string {
    public static String extractNum(String s) {
        String ss = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                ss += s.charAt(i);
            }
        }
        return ss;
    }
}