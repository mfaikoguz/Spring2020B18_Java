package Practice;

public class A_166_Methods_with_String_1_merge_them {
    /*
    When gears merge and work together, one teeth from each one goes in order.

Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one.
Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
     */

    public static String mergeStrings(String one, String two) {
        String result = "";
        if (one.length() > two.length()) {
            for (int i = 0; i < two.length(); i++) {
                result += "" + one.charAt(i) + two.charAt(i);
            }
            result += "" + one.substring(two.length());
        } else {
            for (int i = 0; i < one.length(); i++) {
                result += "" + one.charAt(i) + two.charAt(i);
            }
            result += "" + two.substring(one.length());
        }
        return result;
    }


    public static void main(String[] args) {
        mergeStrings("faik", "Oguz");
    }
}
