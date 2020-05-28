package day44_Exceptions;

public class UncheckedException {
    public static void main(String[] args) {

        System.out.println("Test completed1");
        // executed because line 6 compiles before the error at line 9

        System.out.println(9 / 0);
        // Runtime Exception (Arithmetic Exception)

        System.out.println("Test completed2");
        // can't be executed because line 9 gives error before line 12 to compile

        int[] arr = {1, 2, 3};
        System.out.println(arr[200]);
        // Runtime Exception (ArrayIndexOutOfBounds Exception)
    }
}