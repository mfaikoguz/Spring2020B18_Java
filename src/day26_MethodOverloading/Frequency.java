package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        /*
        1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
         */
        int num1 = frequency("AAAAAAAJHDJAHDKASBCJKASBDKJA", 'A');
        System.out.println(num1);
    }

    public static int frequency(String str, char ch) {
        char[] arr = str.toCharArray(); // [A, A, A]
        int count = 0; // 1 + 1 + 1
        for (char each : arr) { // 3
            if (each == ch) {
                count++;
            }
        }
        return count;

    }
}
