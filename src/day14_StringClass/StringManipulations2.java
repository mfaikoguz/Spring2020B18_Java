package day14_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "";
        boolean bool1 = str.isEmpty(); // is String str empty?
        System.out.println(bool1);

        String username = "";
        if (username.isEmpty()) {
            System.out.println("Please provide the username!");
        }

        String s1 = "Cat"; // String literal
        String s2 = new String("Cat");
        String s3 = "cat";
        System.out.println(s1 == s2); // false, different memory (pool and heap)
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));
    }
}
