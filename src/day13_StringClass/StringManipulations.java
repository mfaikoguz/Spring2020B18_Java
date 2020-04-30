package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        //.charAt()
        System.out.println(".charAt()");
        System.out.println("---------");

        String str = "Cybertek";
        //            01234567

        char ch1 = str.charAt(5); // 't'
        System.out.println(ch1 == 'A');
        //                 't' == 'A'  false

        System.out.println(ch1 == 'T');
        //                 't' == 'T'  false

        //.length()
        System.out.println("=========================================");
        System.out.println(".length");
        System.out.println("-------");

        int totalLength = str.length();
        System.out.println(totalLength);

        System.out.println(totalLength > 250); // false

        String str2 = "Today is great day, Java is fun";
        //             012345...

        int maxIndexNum = str2.length() -1;
        System.out.println(maxIndexNum);

        // .concat()
        System.out.println("=========================================");
        System.out.println(".concat()");
        System.out.println("---------");

        String s1 = "Cybertek";
        s1 = s1.concat(" School"); // Cybertek School

        System.out.println(s1);

        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);
        s2 = s2.concat(" is a programming language");

        String r1 = "Java is fun";
        r1 = r1.concat(", and it's easy"); // need to assign r1 = r1.concat() to concat because String in immutable

        System.out.println(r1);

        // .toLowerCase()
        System.out.println("=========================================");
        System.out.println(".toLowerCase()");
        System.out.println("--------------");

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase(); // need to assign it back to name1 to change it
        System.out.println(name1);

        // toUpperCase()
        System.out.println("=========================================");
        System.out.println(".toUpperCase()");
        System.out.println("--------------");

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        // .trim()
        System.out.println("=========================================");
        System.out.println(".trim()"); // removes unused space and returns new String
        System.out.println("-------");

        String A1 = "     Today     is      a      great     day      ";
        A1 = A1.trim();
        System.out.println(A1);
    }
}
