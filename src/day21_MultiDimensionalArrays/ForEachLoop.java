package day21_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        for(DataType variableName: ArrayName) {

        }
        */
        /*
        When do we use it:
        Whenever we don't need to provide index numbers or iterators
         */
        int[] nums = {1, 2, 3, 4};
        for (int eachElement: nums) { // number of execution depends on the array size, in this case 4 times.
            System.out.println(eachElement);
        }

    }
}
