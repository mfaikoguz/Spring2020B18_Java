package Practice;

import java.util.ArrayList;

public class Methods_with_ArrayList_swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        String first = list.get(pos1);
        String second = list.get(pos2);
        list.set(pos1, second);
        list.set(pos2, first);
        return list;
    }

    public static void main(String[] args) {

    }
}
