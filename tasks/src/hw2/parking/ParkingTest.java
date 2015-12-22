package hw2.parking;

/**
 * Created by alexander on 21.12.15.
 */
public class ParkingTest {

    public static void main(String[] args) throws Parking.ParkingFullException {

        Parking parking = new Parking(3);

        Biker bike1 = new Biker("Zebra");
        Biker bike2 = new Biker("Eagle");
        Biker bike3 = new Biker("Bull");
//        Biker biker4 = new Biker("Stuff");
//        parking.addBikeOnLastFreePlace(biker4);

        parking.addBikeOnLastFreePlace(bike1);
        parking.addBikeOnLastFreePlace(bike2);
        parking.addBikeOnLastFreePlace(bike3);

//        System.out.println(parking.showAllInGarage());
        System.out.println(parking.getSize());

        parking.addBikeByPlaceNumber(4);
        parking.addBikeByPlaceNumber(5);
        System.out.println(parking.getSize());




    }

}
