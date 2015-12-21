package parking;

/**
 * Created by alexander on 21.12.15.
 */
public class ParkingTest {

    public static void main(String[] args) {

        Parking parking = new Parking(3);

        Bike bike1 = new Bike("Zebra");
        Bike bike2 = new Bike("Eagle");
        Bike bike3 = new Bike("Bull");

        parking.addBikeByPlaceNumber(1);

    }

}
