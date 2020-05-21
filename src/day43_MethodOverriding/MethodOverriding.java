package day43_MethodOverriding;

class Test {
    public void method() {
        System.out.println("Mehmet");
    }
}


public class MethodOverriding extends Test {

    public void method() {
        System.out.println("Faik");
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method(); // Mehmet

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method(); // Faik
    }
}
