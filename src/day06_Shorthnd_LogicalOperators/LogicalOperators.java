package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!result1); //not true = false
        boolean result2 = 10 + 15 > 15;
        System.out.println(result2);

        boolean result3 = !true == !false;
        System.out.println(result3);

        boolean R1 = "Corona Virus" != "End of the World" && "Toilet paper" == "Cure";
        //                          true                  &&          false
        System.out.println(R1);

        boolean R4 = true != false || false == !true;
        //                  true   ||     true       ==> true

        System.out.println(R4);

        boolean R5 = true != false && !false == !true;
        //                  true   &&     false        ==> false

        System.out.println(R5);

        boolean R6 = !!!false; // not false --> false --> not false ==> true --> false --> true
        // (odd number of exclamation mark = change it, if even don't change it)

        System.out.println(R6);

    }
}
