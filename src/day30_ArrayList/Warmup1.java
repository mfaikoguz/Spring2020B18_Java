package day30_ArrayList;

import java.util.Arrays;

public class Warmup1 {
    public static void main(String[] args) {
        /*
        UP TASKS:
	1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

         */

        String str = "a1b2c3";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
