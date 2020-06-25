package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemovingDuplicateWarmup2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mehmet");
        list.add("Faik");
        list.add("Faik");
        list.add("Faik");
        list.add("Mehmet");
        list.add("Oguz");
        list.add("Oguz");
        LinkedHashSet<String> set1 = new LinkedHashSet<>(list);
        System.out.println(set1);
    }
}
