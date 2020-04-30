package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        int min = (num1 < num2) ? num1 : num2;

        System.out.println(min);

        System.out.println("=====================================================");

        int hour = 14;

        String result = (hour < 12) ? "Good Morning" : (hour > 12 && hour < 17) ? "Good Afternoon" : "Good Evening";

        System.out.println(result);

        System.out.println("=====================================================");

        int num3 = 12;

        String result2 = (num3 % 5 == 0 && num3 % 3 ==0) ? "Divisible by 3 and 5"
                : (num3 % 5 == 0 && num3 % 3 != 0) ? "Divisible by 5 but not 3"
                : (num3 % 5 != 0 && num3 % 3 == 0) ? "Divisible by 3 but not 5"
                : "Not divisible by 3 or 5";

        System.out.println(result2);

    }
}
