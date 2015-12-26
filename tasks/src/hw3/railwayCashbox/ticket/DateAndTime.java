package hw3.railwayCashbox.ticket;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {

    private LocalDate date;
    private LocalTime time;

    public DateAndTime(int year, int month, int day, int hours, int minutes) {
        date = LocalDate.of(year, month, day);
        time = LocalTime.of(hours, minutes);
    }

    @Override
    public String toString() {
        return String.format("DATE: %d, %d, %d\nTIME: %d, %d",
                date.getYear(), date.getMonth(), date.getDayOfMonth(),
                time.getHour(), time.getMinute());
    }

}
