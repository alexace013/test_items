package utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {

    private LocalDate date;
    private LocalTime time;

    public DateAndTime(int year, Month month, int day, int hours, int minutes) {
        date = LocalDate.of(year, month, day);
        time = LocalTime.of(hours, minutes);
    }

    public DateAndTime(int year, int month, int day, int hours, int minutes) {
        date = LocalDate.of(year, month, day);
        time = LocalTime.of(hours, minutes);
    }

    public int getYear() {
        return date.getYear();
    }

    public Month getMonth() {
        return date.getMonth();
    }

    public int getMonthInt() {
        return date.getMonth().getValue();
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    public int getHours() {
        return time.getHour();
    }

    public int getMinutes() {
        return time.getMinute();
    }

    @Override
    public String toString() {
        return String.format("DATE: %d, %d, %d\nTIME: %d, %d",
                date.getYear(), date.getMonth(), date.getDayOfMonth(),
                time.getHour(), time.getMinute());
    }

}
