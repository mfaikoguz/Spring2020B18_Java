package day05_Unary_ShorthandOperators;

import org.w3c.dom.ls.LSOutput;

public class VariablesPractice {
    public static void main(String[] args) {
        int a1 = 100;
        float f1 = (long)a1;
        System.out.println(f1);

        long l1 = (long)f1;

        System.out.println(l1);

        String name;

        // System.out.println(name); local variables cannot be used without initializing

    }
}
