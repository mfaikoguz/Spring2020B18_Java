package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {

        try {
            System.out.println(100 / 0); // Arithmetic
        } catch (ClassCastException e) { // try this, doesn't work? go to the next catch block
            System.out.println("Class cast");
        } catch (NoSuchElementException e) { // try this, doesn't work? go to the next catch block
            System.out.println("No such element");
        } catch (IndexOutOfBoundsException e) { // try this, doesn't work? go to the next catch block
            System.out.println("Index out of bounds");
        } catch (ArithmeticException e) { // this is the correct exception, so print this one("Arithmetic")
            System.out.println("Arithmetic");
        } catch (RuntimeException e) { // we already found the correct exception, this one doesn't print
            System.out.println("Runtime");
        } /* catch (ArithmeticException e) { // parent exception MUST be after child
        System.out.println("Arithmetic 2");
        } */
    }
}