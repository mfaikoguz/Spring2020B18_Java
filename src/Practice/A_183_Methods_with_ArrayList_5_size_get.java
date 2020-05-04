package Practice;

import java.util.ArrayList;

public class A_183_Methods_with_ArrayList_5_size_get {
    public static int sum(ArrayList<Integer> ints) {
        int count = 0;
        for (int i = 0; i < ints.size(); i++) {
            count += ints.get(i);
        }
        return count;

    }
}
