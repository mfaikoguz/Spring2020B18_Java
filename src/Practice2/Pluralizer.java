package Practice2;

import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:

        if (amt > 1 || amt == 0) {
            if (word.endsWith("fe")) {
                System.out.println(amt + " " + word.substring(0, word.length() - 2).concat("ves"));
            } else if (word.endsWith("sh") || word.endsWith("ch")) {
                System.out.println(amt + " " + word.concat("es"));
            } else if (word.endsWith("us")) {
                System.out.println(amt + " " + word.substring(0, word.length() - 2).concat("i"));
            } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                System.out.println(amt + " " + word.concat("s"));
            } else if (word.endsWith("y")) {
                System.out.println(amt + " " + word.substring(0, word.length() - 1).concat("ies"));
            } else {
                System.out.println(amt + " " + word.concat("s"));
            }
        } else {
            System.out.println(amt + " " + word);
        }
    }
}