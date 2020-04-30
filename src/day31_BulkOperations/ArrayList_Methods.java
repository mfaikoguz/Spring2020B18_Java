package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        boolean r1 = list1.contains("C"); // true
        System.out.println(r1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list1); // {A, B, C, D}
        Collections.sort(list2); // {A, B, C, D}

        boolean r2 = list1.equals(list1); // true
        System.out.println(r2);

        System.out.println("============================");

        // 5, 4, 3, 2, 1

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        Collections.sort(list);

        ArrayList<Integer> reversedList = new ArrayList<>();


        for (int i = list.size() - 1; i >= 0; i--) {
            // System.out.print(list.get(i) + " ");
            reversedList.add(list.get(i));
        }
        System.out.println(reversedList);
    }

}
