package hw3.railwayCashbox.test;

import hw3.railwayCashbox.train.Train;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestTrain1 {

    public static void main(String[] args) {

        Train train = new Train(18, "A", "B", LocalDate.now(), LocalTime.now(), 10);

        for (int i = 0; i < train.getCarriages().length; i++) {
            System.out.println(train.carriages[i].toString());
        }

        System.out.println(train.carriageIndex(4));

    }

}
