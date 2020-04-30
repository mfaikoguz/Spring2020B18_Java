package day04_JavaRecap;

public class Variables_Practice {
    public static void main(String[] args) {
        // Datatype variableName = Data;

        byte num1 = 127;
        short num2 = num1;

        // byte num3 = num2; double > float > long > int > short > byte
        int num4 = num2;

        long num5 = 999999999999L;

        float num6 = 100L;
        System.out.println(num6);

        float num7 = 0.5F;

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( 9 > 10 );
        System.out.println( 9 >= 9 );
        System.out.println( 9 != 10 );
        System.out.println( 'a' == 'b' );
        System.out.println( 'a' == 'b' -1);
    }
}
