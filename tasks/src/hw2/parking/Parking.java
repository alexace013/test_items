package hw2.parking;

/*
*  class Parking
           methods
           - addMotoOnLastFreePlace +
           - takeLastMoto +
           - addMotoByPlaceNumber +
           - takeMotoByPlaceNumber +
           - clearGaragePlaces +
           - open +
           - close +
           - changeAddress
           - showAllInGarage +
* */

import java.util.HashMap;
import java.util.Map;

public class Parking {

    private final int AMOUNT;
    private Map<Integer, Motorcycle> places = new HashMap<>();
    private Integer numberPlace;
    private Integer busy = 0;
    private int size;
    private boolean isWork;

    public Parking() {
        AMOUNT = 7;
    }

    public Parking(int amount) {
        this.AMOUNT = amount;
    }

    public int getSize() {
        return size;
    }

    public void open() {
        isWork = true;
    }

    public void close() {
        isWork = false;
    }

    public void addMotoByPlaceNumber(int numberPlace, Motorcycle motorcycle) {

        if (!controlParkingWork()) {
            return;
        }

        if (places.get(numberPlace) == null) {

            places.put(numberPlace, motorcycle);
            this.numberPlace = numberPlace;
            motorcycle.setParkPlace(numberPlace);
            busy++;
            size++;

        } else {

            System.out.println("this place number is busy.");

        }

    }

    public int addMotoOnLastFreePlace(Motorcycle motorcycle) throws ParkingFullException {

        if (!controlParkingWork()) {
            return - 1;
        }

        if (size == AMOUNT) {
            throw new ParkingFullException("no place.");
        }

        for (int i = 1; i <= AMOUNT; i++) {
            if (places.get(i) == null) {
                places.put(i, motorcycle);
                motorcycle.setParkPlace(i);
                size++;
                busy++;
                break;
            }
        }

        return -1;

    }

    public Motorcycle takeLastBike() {

        if (!controlParkingWork()) {
            return null;
        }

        controlParkingSize();

        numberPlace = places.size();

        if (places.get(numberPlace) == null) {
            throw new IndexOutOfBoundsException("place is empty");
        }

        Motorcycle motorcycle = places.get(numberPlace);
        motorcycle.setParkPlace(null);
        places.remove(numberPlace);
        size--;
        busy--;
        System.out.println(String.format("bike %s takes from %d place",
                motorcycle.getBrand(), numberPlace));

        return motorcycle;

    }

    public Motorcycle takeMotoByPlaceNumber(int numberPlace) {

        if (!controlParkingWork()) {
            return null;
        }

        controlParkingSize();

        if (numberPlace > places.size()) {
            throw new IndexOutOfBoundsException("your index is fail");
        } else if (places.get(numberPlace) == null) {
            throw new NullPointerException("place is empty");
        }

        Motorcycle motorcycle = places.get(numberPlace);
        motorcycle.setParkPlace(null);
        places.remove(numberPlace);
        size--;
        busy--;
        System.out.println(String.format("bike %s takes from %d place",
                motorcycle.getBrand(), numberPlace));

        return motorcycle;

    }

    public int clearGaragePlaces() {

        if (!controlParkingWork()) {
            return - 1;
        }

        places.clear();
        size = 0;
        busy = 0;

        return places.size();
    }

    public String showAllInGarage() {

        if (!controlParkingWork()) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (Motorcycle motorcycle : places.values()) {
            if (places.values().iterator().hasNext()) {
                builder.append(String.format("brand: %s, place: %d\n",
                        motorcycle.getBrand(), motorcycle.getParkPlace()));
            }
        }

        return builder.toString();

    }

    private void controlParkingSize() {
        if (this.size < 0) {
            new ParkingFullException(new IndexOutOfBoundsException("size is less than zero."));
        }
    }

    private boolean controlParkingWork() {
        if (isWork == false) {
            System.err.println("sorry, parking is close.");
            return false;
        }
        return true;
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
