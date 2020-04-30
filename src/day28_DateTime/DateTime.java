package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);



        LocalDateTime dt2 = LocalDateTime.of(1999, 1, 8, 13, 55, 58);
        System.out.println(dt2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dt3 = LocalDate.of(1999, 1, 8);
        System.out.println(dt3.format(dtf));
    }
}
