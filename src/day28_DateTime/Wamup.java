package day28_DateTime;

import java.time.LocalDate;

public class Wamup {
    public static void main(String[] args) {
        /*
        Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
         */

        String[] friends = {"John", "Aaron", "Daniel"};

        LocalDate JohnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2020, 10, 12);
        LocalDate DanielBirthday = LocalDate.of(2020, 5, 6);

        LocalDate[] birthdays = {JohnBirthday, AaronBirthday, DanielBirthday};

        for (int i = 0; i < friends.length; i++) {
            String name = friends[i];
            LocalDate bd = birthdays[i];
            System.out.println(name + bd);
        }
    }
}
