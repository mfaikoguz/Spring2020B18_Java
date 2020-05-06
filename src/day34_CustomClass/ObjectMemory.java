package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        ArrayList<Integer> list2 = list1;

        list1.remove(2);

        System.out.println(list1);
        System.out.println(list2);

    }
}
