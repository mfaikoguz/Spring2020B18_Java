package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class A_190_Methods_with_ArrayList_11_appendPosSum {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num) {
            ArrayList<Integer> sum = new ArrayList<>();
            for (Integer each : num) {
                if (each > 0) {
                    sum.add(each);
                }
            }
            Integer sum2 = 0;
            for (Integer each2 : sum) {
                sum2 += each2;
            }
            sum.add(sum.size(), sum2);
            return sum;
        }
    }
