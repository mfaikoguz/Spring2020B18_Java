package day23_Methods;

public class UniqueValues {
    public static void main(String[] args) {
        /*
        1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
        */

        String[] arr = {"A", "B", "A", "C", "C"}; // B is unique
        //               0    1    2    3    4


        for (String each3 : arr) { // for(int j = 0; j < arr.length; j++)... kullanilabilir
            //"A"
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(each3)) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(each3);
            }
        }


            System.out.println("========================");
            for (String each2 : arr) {
                int count = 0;

                for (String each : arr) {
                    if (each.equals(each2)) {
                        count++;
                    }
                }

                if (count == 1) { // if it's unique
                    System.out.println(each2);
                }
            }
        }
    }