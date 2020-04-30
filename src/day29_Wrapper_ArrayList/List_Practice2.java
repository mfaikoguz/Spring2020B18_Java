package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
                Do not use any sorting
    */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3133);
        numbers.add(213);
        numbers.add(98);
        numbers.add(132);
        numbers.add(322);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        System.out.println(max);

    }

}
