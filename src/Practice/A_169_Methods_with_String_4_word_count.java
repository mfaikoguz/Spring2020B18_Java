package Practice;

public class A_169_Methods_with_String_4_word_count {
    /*
    This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1
     */
    public static int wordCount(String words) {
        int count = 0;
        String[] wordsAr = words.split(" ");
        for (String each : wordsAr) {
            count++;
        }
        return count;
    }
}
