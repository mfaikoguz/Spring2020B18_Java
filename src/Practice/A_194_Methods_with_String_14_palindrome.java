package Practice;

public class A_194_Methods_with_String_14_palindrome {
    public static boolean isPalindrome(String check) {
        String reverse = "";
        String check1 = check.replaceFirst(" ", "");
        for (int i = check1.length() - 1; i >= 0; i--) {
            reverse += check1.charAt(i);
        }
        if (check1.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
