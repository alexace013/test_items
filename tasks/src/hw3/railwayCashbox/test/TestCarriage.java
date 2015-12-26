package hw3.railwayCashbox.test;

import hw3.railwayCashbox.carriage.Carriage;
import hw3.railwayCashbox.carriage.CoupeCarriage;
import hw3.railwayCashbox.carriage.EconomClassCarriage;
import hw3.railwayCashbox.carriage.SleeperCarriage;

public class TestCarriage {

    public static void main(String[] args) {

        Carriage econom = new EconomClassCarriage();
//        carriage1.setCarriageNumber(1);
        System.out.println(econom.getAllPlacesToString());
        System.out.println("========== ========== ========== ==========\n");
        Carriage coupe = new CoupeCarriage();
        System.out.println(coupe.getAllPlacesToString());
        System.out.println("========== ========== ========== ==========\n");
        Carriage sleeper = new SleeperCarriage();
        System.out.println(sleeper.getAllPlacesToString());

    }

}
