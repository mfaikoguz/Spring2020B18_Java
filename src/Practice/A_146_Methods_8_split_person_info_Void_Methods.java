package Practice;

import java.util.Scanner;

public class A_146_Methods_8_split_person_info_Void_Methods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        String[] arr = info.split(",");
        System.out.println("person name: " + arr[0] + " last name: " + arr[1] + " age: " + arr[2]);


    }//end person

}