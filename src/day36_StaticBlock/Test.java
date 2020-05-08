package day36_StaticBlock;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticBlock2.tester1);
        /* output is null when we put the tester1.setTesterInfo in the main method
         but when we put it in the static block it works
         */
    }
}
