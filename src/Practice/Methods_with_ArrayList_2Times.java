package Practice;

import java.util.ArrayList;

public class Methods_with_ArrayList_2Times {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums) {
        ArrayList<Integer> repeat = new ArrayList<>();
        for (Integer each : nums) {
            repeat.add(each);
        }
        int index = 0;
        for (Integer each3 : nums) {
            repeat.add(index, each3);
            index += 2;
        }
        return repeat;
    }
}
