package day53_Iterator_Maps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateWarmup {
    public static void main(String[] args) {
        String[] arr = {"Mehmet", "Faik", "Oguz", "Mehmet", "Mehmet"};
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);
    }
}
