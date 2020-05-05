package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_with_ArrayList_removeAll {
    public static void removeAll(ArrayList<String> wordList, String targetWord) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(targetWord)) {
                wordList.remove(wordList.get(i));
            }
        }
        System.out.println(wordList);
    }

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi", "hey", "hi", "yo"));
        removeAll(wordList, "hi");
    }
}
