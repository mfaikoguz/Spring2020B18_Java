package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MM/dd/yyyy hh:mm a");

        LocalDateTime dateTime1 = LocalDateTime.of(2015, 12, 25, 11, 30, 45);
        System.out.println(dateTime1.format(dtf));
    }
}