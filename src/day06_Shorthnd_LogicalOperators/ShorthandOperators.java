package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 20;
        x += 10; // x = x + 10 = 30
        System.out.println( x ); // 60

        x += 60;
        System.out.println( x ); // 90

        String schoolname = "CyberTek";
        schoolname += 123;
        System.out.println(schoolname); // schoolname = schoolname + 123;

        System.out.println( 'a' + 'b' ); // number, 97 + 98 = 195

        char ch1 = 'a';
        ch1 += 'b';

        System.out.println(ch1); //returns character in 195 value

        int num = 'z';
        num += 'x';
        System.out.println(num); // 242, because data type is int so it's going to return number

        int A = 100;
        A -= 90;

        System.out.println(A); // 10

        int B = 200;
        B -= A; // B = B - A

        System.out.println(B);
    }
}
