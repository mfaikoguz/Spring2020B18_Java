package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class A_190_Methods_with_ArrayList_11_appendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(3, 6, 8, 2));
        ArrayList<Integer> result = appendPosSum(numbers);
        System.out.println(result);
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> numbers) {
        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                sum += numbers.get(i);
            }
        }
        numbers.add(sum);
        return numbers;
    }
}
