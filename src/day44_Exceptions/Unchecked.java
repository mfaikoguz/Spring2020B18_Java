package day44_Exceptions;

public class Unchecked {
    public static void main(String[] args) {

        System.out.println("Test completed1");
        // executed because line 6 compiles before the error at line 9

        System.out.println(9 / 0);
        // Runtime Exception

        System.out.println("Test completed2");
        // can't be executed because line 9 gives error before line 12 to compile
    }
}