package DateTimeAPI;

import java.time.LocalDate;

public class LeapYearCheck {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        if (today.isLeapYear())
            System.out.println(today.getYear() + " is a Leap Year");
        else
            System.out.println(today.getYear() + " is Not a Leap Year");
    }
}
