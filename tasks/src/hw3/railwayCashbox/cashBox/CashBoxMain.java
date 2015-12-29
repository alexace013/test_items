package hw3.railwayCashbox.cashBox;

import hw3.railwayCashbox.train.Train;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CashBoxMain {

    public static void main(String[] args) {

        LocalDate date_kiev_lviv = LocalDate.of(2015, 12, 31);
        LocalTime time_kiev_lviv = LocalTime.of(11, 41);
        Train kiev_lviv = new Train(207, "Kiev", "Lviv", date_kiev_lviv, time_kiev_lviv, 20);

        List<Train> trains = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            trains.add(new Train(1 + i, "Kiev", "Lviv", date_kiev_lviv, time_kiev_lviv, 10));
        }
        CashBox cashBox = new CashBox((ArrayList<Train>) trains);
        LocalDate testDate = LocalDate.of(2015, 12, 31);
        cashBox.allTicketsInfo(testDate, 3);


    }

}
