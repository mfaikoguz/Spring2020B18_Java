package day29_Wrapper_ArrayList;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        /*
        String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find the maximum and minimum numbers
		NOTE: Do not use sort method
         */

        String[] arr = {"1", "3.5", "3", "3.5", "4.5"};

        double max = Double.MIN_VALUE;

        for (String each : arr) {
            double num = Double.parseDouble(each);
            if (num > max) {
                max = num;
            }

        }
        System.out.println(max);
    }
}
