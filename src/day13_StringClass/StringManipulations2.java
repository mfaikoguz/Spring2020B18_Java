package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        //.substring()
        System.out.println(".substring()");
        System.out.println("------------");

        String str = "Cybertek School is the best";
        String schoolName = str.substring(0,8); // ending index is not included
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        String firstName;
        String lastName;

        firstName = fullName.substring(0,7);
        lastName = fullName.substring(7,12);
        System.out.println(firstName);
        System.out.println(lastName);

        // .replace()
        System.out.println("=========================================");
        System.out.println(".replace");
        System.out.println("--------");

        String s2 = "I like C# Programming C# C#";
        s2 =   s2.replace("C#", "Java" );

        System.out.println(s2);

        String name = "COVID 18";
        name = name.replace("18", "19");

        System.out.println(name);

        // .replaceFirst()
        System.out.println("=========================================");
        System.out.println(".replaceFirst()");
        System.out.println("---------------");

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");

        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");

        System.out.println(r2);

    }
}
