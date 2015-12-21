package parking;

/*
*  class Parking
           methods
           - addMotoOnLastFreePlace +
           - takeLastMoto +
           - addMotoByPlaceNumber
           - takeMotoByPlaceNumber
           - clearGaragePlaces +
           - open
           - close
           - changeAddress
           - showAllInGarage
* */

import java.util.HashMap;
import java.util.Map;

public class Parking {

    private final int AMOUNT;
    private Map<Integer, Bike> places = new HashMap<>();
    private Integer numberPlace;
    private Integer busy = 0;
    private int size;

    public Parking() {
        AMOUNT = 7;
    }

    public Parking(int amount) {
        this.AMOUNT = amount;
    }

    public void addBikeByPlaceNumber(int numberPlace) {
        this.numberPlace = numberPlace;


    }

    public int addBikeOnLastFreePlace(Bike bike) throws ParkingFullException {

        if (size == AMOUNT) {
            throw new ParkingFullException("no place.");
        }

        for (int i = 1; i <= AMOUNT; i++) {
            if (places.get(i) == null) {
                places.put(i, bike);
                bike.setParkPlace(i);
                size++;
                busy++;
                break;
            }
        }

        return -1;

    }

    public Bike takeLastBike() {

        numberPlace = places.size();

        if (places.get(numberPlace) == null) {
            throw new IndexOutOfBoundsException("place is empty");
        }

        Bike bike = places.get(numberPlace);
        bike.setParkPlace(null);
        places.put(numberPlace, null);
        size--;
        busy--;
        System.out.println(String.format("bike %s takes from %d", bike.getBrand(), numberPlace));

        return bike;
    }

    public int clearGaragePlaces() {
        for (int i = places.size(); i >= 0; i--) {
            places.remove(i, null);
        }
        size = 0;
        busy = 0;
        return places.size();
    }

    public String showAllInGarage() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < places.size(); i++) {
            builder.append(String.format("%d. brand:  %s, park place: %s\n", places.get(i), places.get(i).getBrand(), places.get(i).getParkPlace()));
        }
        return builder.toString();
    }

    private void controlParkingSize() {
        if (this.size < 0) {
            new ParkingFullException(new IndexOutOfBoundsException("size is less than zero."));
        }
    }

    @Override
    public String toString() {
        return String.format("Parking have: \nplaces: %d\nbusy: %d\namount: %d", places, busy, AMOUNT);
    }


    public class ParkingFullException extends Exception {

        public ParkingFullException(String string) {
            super(string);
        }

        public ParkingFullException(IndexOutOfBoundsException idxExeption) {
            super(idxExeption);
        }

    }

}
