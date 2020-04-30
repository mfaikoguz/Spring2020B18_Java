package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {
        String str = "I like to learn Java. I like to watch movie Jumanji";
        int a1 = str.indexOf("J"); // returns the index num of first matching one
        System.out.println(a1);

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I") + 1; // it returns the second I, because we added space before the I just like in the sentence.
        System.out.println(a3);


        String s = "I like Java, and I like reading";
        int a4 = s.lastIndexOf("I"); // it returns the last I it sees
        System.out.println(a4);
    }
}
