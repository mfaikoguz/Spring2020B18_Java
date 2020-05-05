package Practice2;

public class A_193_OOP_2_lame_calculator_Object_Instances {
    public static void main(String[] args) {

        LameCalculator lc = new LameCalculator();
        System.out.println("1+1 = " + lc.plus(1, 1));
        System.out.println("2-3 = " + lc.minus(2, 3));
        System.out.println("2x3 = " + lc.multiply(2, 3));
        System.out.println("10:2 = " + lc.divide(10, 2));


    }
}
