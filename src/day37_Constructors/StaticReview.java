package day37_Constructors;

public class StaticReview {
    static int a; // 1 copy
    int b; // 2 copy

    public static void main(String[] args) {
        StaticReview obj1 = new StaticReview();
        obj1.b = 10;
        obj1.a = 10;

        StaticReview obj2 = new StaticReview();
        obj2.b = 30;
        obj2.a = 40; // static 1 copy oldugu icin en son declare edilen degeri verir

        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }
}