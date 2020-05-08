package day36_StaticBlock;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method executed");
        method1();
    }

    public static void method1() {
        System.out.println("Custom method executed");
    }

    static {
        System.out.println("Static block executed"); // static block always executes first and only once
    }
}
