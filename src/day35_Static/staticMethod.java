package day35_Static;

public class staticMethod {

    int a = 100;
    static int b = 200;

    public static void main(String[] args) {

        // System.out.println(a); // static only accepts static

        staticMethod obj = new staticMethod();

        System.out.println(obj.a); // instances can ONLY be called through object

        System.out.println("==============================================================================");

        System.out.println(b); // static variable to the method works
        System.out.println(staticMethod.b); // through the class name works
        System.out.println(obj.b); // it still works but statics preferred to be called through the class name
    }

    public void method() {
        System.out.println(a); // it didn't get accepted in the static method but it got accepted in the instance method
        System.out.println(b); // you can use anywhere in the class but there is only one copy
    }
}
