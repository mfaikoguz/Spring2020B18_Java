package day37_Constructors;

// import java.util.Arrays; // only imports arrays class in java util

import java.util.*; // imports every class in the java util package

// import static day37_Constructors.Data.staticVariable;
// import static day37_Constructors.Data.staticMethod;
import static day37_Constructors.Data.*;


public class importStatement {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Arrays.sort(arr);

        System.out.println(staticVariable);
        staticMethod();
    }
}
