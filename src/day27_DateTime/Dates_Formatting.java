package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yyyy");
        /* MM --> 04 MMM --> Apr MMMM --> April
           dd --> 23 EEE --> Thu EEEE --> Thursday EEEEE --> T
           yy --> 20 yyy --> 2020 yyyy --> 2020
         */
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf)); // might use toUpperCase() is we want to
    }
}
