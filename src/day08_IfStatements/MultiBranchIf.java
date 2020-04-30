package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        int a = 100;

        /*boolean zero = a == 0;
        boolean negative = a < 0;
        boolean positive = a > 0;
        */

        if ( a == 0 ) {
            System.out.println("zero");
        } else if ( a < 0 ) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }

    }
}
