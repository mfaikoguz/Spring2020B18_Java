package day29_Wrapper_ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        int a = 100; // primitive
        Integer b = 200; // wrapper class

        short s1 = 200;
        int n1 = s1;
        // Integer n2 = s1; // can't assign short variable to Integer. Integer only accepts int.

        Integer n2 = n1; // can assign short value to Integer after we assign that value to int variable

        // ===================================================================================================

        int a1 = 20;
        float f1 = a1;

        Float f2 = f1;

        Integer I1 = 200;
        int a2 = I1;

        Byte B1 = 126;
        int a3 = B1; // can assign Wrapper class to different data-type
        System.out.println(a3);
    }
}
