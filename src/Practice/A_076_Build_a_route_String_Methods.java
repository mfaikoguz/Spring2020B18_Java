package Practice;

import java.util.Scanner;

public class A_076_Build_a_route_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        if (start.equalsIgnoreCase(end)){
            System.out.println(end+" found");
        }
        if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("b")){
            System.out.println("right: B found");
        }
        if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("c")){
            System.out.println("right > down: C found");
        }
        if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("d")){
            System.out.println("right > down > left: D found");
        }
        if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("c") ){
            System.out.println("down: C found");
        }
        if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("d")){
            System.out.println("down > left: D found");
        }
        if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("a")){
            System.out.println("down > left > up: A found");
        }
        if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("d")){
            System.out.println("left: D Found");
        }
        if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("a")){
            System.out.println("left > up: A found");
        }
        if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("b")){
            System.out.println("left > up > right: B found");
        }
        if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("a")){
            System.out.println("up: A found");
        }
        if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("b")){
            System.out.println("up > right: B found");
        }
        if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("c")){
            System.out.println("up > right > down: C found");
        }
    }
}
