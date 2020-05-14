package OfficeH.Practice0513;

public class statics {

    int instanceVariable = 100;
    static int staticVariable = 200;


    public static void staticMethod() {
        // System.out.println(instanceVariable);
        // instanceMethod();
        System.out.println(staticVariable);
    }

    public void instanceMethod() {
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }

    public static void main(String[] args) {
        // System.out.println(instanceVariable);
        // instanceMethod();
        System.out.println(staticVariable);
        staticMethod();
    }

}
