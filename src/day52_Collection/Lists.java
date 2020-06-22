package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        // List<String> list= new List<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.remove(0);

        System.out.println("====================================");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        Vector<Integer> vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("=====================================");

        Stack<String> names = new Stack<>();
        names.add("Nurjana");
        names.add("Zareen");
        names.add("Sada");
        names.add("Nuri");
        names.add("Naci");
        System.out.println(names);
        String pop1 = names.pop(); // "Naci"
        System.out.println(pop1);
        System.out.println(names);
        String pop2 = names.pop(); // "Nuri"
        System.out.println(pop2);
        System.out.println(names);
        names.push("Naci");
        names.push("Nuri");


    }
}
