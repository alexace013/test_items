package hw3.railwayCashbox.test;

import hw3.railwayCashbox.carriage.Carriage;
import hw3.railwayCashbox.carriage.CoupeCarriage;
import hw3.railwayCashbox.carriage.EconomClassCarriage;
import hw3.railwayCashbox.carriage.SleeperCarriage;
import hw3.railwayCashbox.train.Train;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestTrain {

    public static void main(String[] args) {

        Carriage econom = new EconomClassCarriage();
        Carriage coupe = new CoupeCarriage();
        Carriage sleeper = new SleeperCarriage();
        Carriage[] carriages = new Carriage[10];

        for (int i = 0; i < 4; i++) {
            carriages[i] = econom;
        }
        for (int i = 4; i < 8; i++) {
            carriages[i] = coupe;
        }
        for (int i = 8; i < carriages.length; i++) {
            carriages[i] = sleeper;
        }

        LocalDate date = LocalDate.of(2015, 12, 31);
        LocalTime time = LocalTime.of(12, 47, 05);

        Train train1 = new Train(18, "London", "Birmingham", date, time, carriages);
        System.out.println(train1.toString());
        train1.setTime(LocalTime.of(12, 48, 17));
        System.out.println(train1.getTime());
        System.out.println(train1.toString());

        for (int i = 0; i < train1.getCarriages().length; i++) {
            System.out.println(train1.getAllCarriages());
        }


    }

}
