package day46_final_abstract;

public class final_Variables {

    final int InstanceVariable = 300;
    // final int InstanceVariable2; // can't use final without initializing if the variable is instance variable

    final static int staticVariable = 1000;

    // final static int StaticVariable2; // can't use final without initializing if the variable is static variable

    public static void main(String[] args) {
        final double PI = 3.14;
        // PI = 3.15;

        final String gender = "Male";
        // gender = "Female";

        final int score;
        score = 100;
        // score = 200;
        System.out.println(score);

        System.out.println("===============================");

        final_Variables obj = new final_Variables();
        // obj.InstanceVariable = 400;

        // staticVariable = 500;
    }
}
