package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup2 {
    public static void main(String[] args) {
        /*
        write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
         */

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();

        int count = 0;
        for (String each : list){
            if (each.equals(list.get(0))) {
                count++;
            }
        }

        if (count > 1) {
            duplicates.add(list.get(0));
        }

        System.out.println(duplicates);

    }
}
