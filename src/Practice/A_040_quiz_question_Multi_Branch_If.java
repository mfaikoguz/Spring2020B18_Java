package Practice;

import java.util.Scanner;

public class A_040_quiz_question_Multi_Branch_If {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String answer = s.nextLine();

        if (answer.equalsIgnoreCase("a")) {
            System.out.println("a is wrong");
        } else if (answer.equalsIgnoreCase("b")) {
            System.out.println("b is correct");
        } else if (answer.equalsIgnoreCase("c")) {
            System.out.println("c is wrong");
        } else {
            System.out.println(answer + " is not a valid answer");
        }
    }
}
