package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        //pre: it changes the value of the variable immediately

        int a = 100;
        System.out.println( ++a ); //101
        System.out.println( a ); //101

        int b = 100;
        System.out.println( --b ); //99
        System.out.println( b ); //99

        //post: first passes the current value, then changes after the current line

        int c = 100;
        System.out.println( c++ ); //100
        System.out.println( c ); //101

        int d = 100;
        System.out.println( d-- ); //100
        System.out.println( d ); //99

        //post and pre examples:

        int z = 10;
        int x = ++z;

        System.out.println(x); // 11
        System.out.println(z); // 11

        int s = 10;
        int f = s++;

        System.out.println(f); // 10
        System.out.println(s); // 11

        double t1 = 3.5;
        double t2 = t1--; //3.5

        System.out.println(t2); // 3.5
        System.out.println(t1); // 2.5

        int r = 25;
        System.out.println( r++ ); // 25
        System.out.println( r-- ); // 26
    }
}
