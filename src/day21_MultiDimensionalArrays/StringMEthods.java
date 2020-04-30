package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMEthods {
    public static void main(String[] args) {
        String name = "Java"; // 'J', 'a', 'v', 'a'

        char[] chars = name.toCharArray();
        System.out.println(chars[0]); // 'J'
        System.out.println(chars[3]); // 'a'
        // System.out.println(chars[4]); // ArrayIndexOutOfBoundsException: 4

        String str = "I like Java";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr)); // [I, like, Java]
        /*
        reverse sentence: day great a is Today
         */
        String sentence = "Today is a great day";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); // [Today, is, a, great, day]

        for (int i = words.length - 1; i >= 0; i--) {
            String eachWords = words[i];
            System.out.print(eachWords + " ");
        }
    }
}
