package day52_Collection;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Mehmet");
        names.add("Faik");
        names.add("Oguz");
        names.add("Oguz");
        names.add("Oguz");
        names.add("Oguz");
        // only accepts one of the duplicates
        // order is according to hashCodes
        System.out.println(names);

        Set<String> names2 = new LinkedHashSet<>();
        names2.add("Mehmet");
        names2.add("Faik");
        names2.add("Oguz");
        names2.add("Oguz");
        names2.add("Oguz");
        names2.add("Oguz");
        // only accepts one of the duplicates
        // order is insertion order
        System.out.println(names2);

        System.out.println("==========================================");

        String[] arr = {"A", "A", "C", "B", "A"};
        LinkedHashSet<String> letters = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(letters); // [A, C, B]

        System.out.println("=======================================");
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(10, 9, 10, 9, 8, 7, 8, 7, 6, 5, 6));
        // removes duplicates and prints in sorted order
        System.out.println(numbers);

        System.out.println("==========================");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset);

    }
}
