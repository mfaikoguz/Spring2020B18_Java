package Practice;

import java.util.ArrayList;

public class A_187_Methods_with_ArrayList_8_CombineAll {
    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < wordList1.size(); i++) {
            list.add(wordList1.get(i));
        }
        for (int i = 0; i < wordList2.size(); i++) {
            list.add(wordList2.get(i));
        }
        return list;
    }
}
