package day38_Constructors;

public class ConstructorCalls2 {
    public ConstructorCalls2() {
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a) {
        this(); // calling the default constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str) {
        this(10); // calling constructor with an int argument
        System.out.println("Constructor with string argument");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("a");
    }
}
