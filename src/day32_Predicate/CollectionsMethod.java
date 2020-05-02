package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */

        System.out.println("=================================");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4));
        // second max: 3

        Integer maxNum = Collections.max(numbers);  //4

        numbers.removeAll(Arrays.asList(maxNum));

        System.out.println(numbers);


        int secondMax = Collections.max(numbers);

        System.out.println(secondMax);

        System.out.println("========================================");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8));
        Integer minNum = Collections.min(list2); //1

        list2.removeAll(Arrays.asList(minNum));  // removes all the minimum number
        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);

        System.out.println("=======================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5)); // [1, 2, 3, 4, 5]
        //                                              0           4

        System.out.println(list3);
        //[5, 2, 3, 4, 1]
        Collections.swap(list3, 0, 4);
        System.out.println(list3);

        System.out.println("========================================");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 5, 3, 4, 1, 1, 8, 9, 1, 1));
        Collections.replaceAll(list4, 1, 12);
        System.out.println(list4);
    }
}
