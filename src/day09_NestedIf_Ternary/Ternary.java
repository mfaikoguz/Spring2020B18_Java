package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if (num % 2 == 0) {
            result = "Even number";
        } else {
            result = "Odd number";
        }

        // if the if statement is only returning value and assigning it to variable then we can apply ternary

        // in ternary: ? means if, : means else

        String result2 = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);
    }
}
