package day05_Unary_ShorthandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        // implicit casting: done automatically
        int a = 10;
        long b = a;

        int a1 = 100;
        long b1 = (long) a1;

        //explicit casting:

        int t = 127;
        byte y = (byte) t;
        short s = (short) t;

        double dNum = 5.5;
        float fNum = (float) dNum;
        System.out.println(fNum);
        double D1 = 10.5;
        long L1 = (long) ((float) D1);

    }
}
