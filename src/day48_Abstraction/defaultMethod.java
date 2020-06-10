package day48_Abstraction;

public interface defaultMethod {
    default void method1() {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        // method1();
        // defaultMethod method = new defaultMethod();
    }
}


class N implements defaultMethod{
    public static void main(String[] args) {
        N obj = new N();
        obj.method1();
    }
}
