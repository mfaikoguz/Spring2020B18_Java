package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();
        EligibleToBuyAlcohol(age);
    }
    public static void EligibleToBuyAlcohol(byte age){

        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible");
        }
    }


    }