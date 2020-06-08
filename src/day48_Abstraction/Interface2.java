package day48_Abstraction;

public interface Interface2 {

    int a = 100;

    public static void main(String[] args) {
        System.out.println(a); // by default static
        // a = 200; // by default final
    }
}
