package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        /*
        decleration
                DataType [] variableName == {data1, data2, data3};

              // 70, 75, 85, 90, 95, 100
         */

        int[] scores = {70, 75, 85, 90, 95, 100};
        //               0   1   2   3   4   5
        // int scores [] = {70, 75, 85, 90, 95, 100}; // another way

        // retrieve: variableName[index]

        int num1 = scores[2]; // 85, int
        System.out.println(num1);

        int num2 = scores[5]; // 100, int
        System.out.println(num2);
        }
    }