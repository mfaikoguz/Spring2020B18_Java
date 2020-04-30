package Practice;

import java.util.Scanner;

public class A_155_Methods_17_Fibonacci_numbers_Void_Methods {
    /*
    In Fibonacci series, next number is the sum of previous two numbers for example
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of Fibonacci series are 0 and 1.
    Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        //WRITE YOUR CODE HERE
        int n1 = 0;
        int n2 = 1;
        int fib[] = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            int sum = n1 + n2;
            fib[i] = n2;
            n1 = n2;
            n2 = sum;

        }
        System.out.println(fib[num]);
    }
}
