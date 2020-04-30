package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 4, 23);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1999, 1, 8);
        System.out.println(birthday);

        // isAfter(date2)
        boolean result1 = date1.isAfter(birthday); // true
        System.out.println(result1);

        // isBefore(date2)
        boolean result2 = date1.isBefore(birthday); // false
        System.out.println(result2);

        // isEqual(date2)
        boolean result3 = date1.isEqual(birthday); // false
        System.out.println(result3);

        // isLeapYear(date2)
        boolean result4 = birthday.isLeapYear(); // false
        System.out.println(result4);

        System.out.println("=================================");
        LocalDate now = LocalDate.now(); // 2020-04-23
        System.out.println("Today is " + now);

        String str = now.toString();
        System.out.println(str.replace("-", " "));
    }
}
