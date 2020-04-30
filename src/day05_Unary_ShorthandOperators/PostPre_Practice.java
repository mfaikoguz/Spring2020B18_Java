package day05_Unary_ShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        //a = 49 + 49 + 50 + 49   = 197;

        System.out.println(a); //197

        int b = 1; //
        b = -b-- + b++ / -b-- * --b;
        //= -1  +  0  /  -1  *  -1;
        // b = -1


        System.out.println(b); // -1

        int x = 10;
        int y = x++;
        System.out.println( y++ + "" + x++ + "" + y);
    }
}
