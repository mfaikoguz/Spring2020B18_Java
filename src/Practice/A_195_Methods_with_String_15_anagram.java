package Practice;

public class A_195_Methods_with_String_15_anagram {
    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int count = 0;
        for (int i = 0; i < word2.length(); i++) {
            if (word1.contains("" + word2.charAt(i))) {
                count++;
            }
        }
        return count == word1.length();
    }
}
