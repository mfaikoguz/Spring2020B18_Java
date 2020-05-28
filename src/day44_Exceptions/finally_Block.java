package day44_Exceptions;

import java.util.NoSuchElementException;

public class finally_Block {
    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);
            System.out.println("Try Block");
        } catch (NoSuchElementException e) { // wrong exception, gives error
            System.out.println("Catch Block");
        } finally { // no matter what, finally block will be executed
            System.out.println("Finally");
        }
    }
}
