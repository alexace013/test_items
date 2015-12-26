package hw3.railwayCashbox.carriage;

import hw3.railwayCashbox.place.Condition;
import hw3.railwayCashbox.place.Place;

public class SleeperCarriage extends Carriage implements Condition {

    private static final double PRICE = 146.51;
    private static final int MAX_SIZE = 18;
    private static String TYPE_NAME = "Sleeper";

    public SleeperCarriage() {
        this.setCarriageType(TYPE_NAME);
        createTicketPlaces();
    }

    @Override
    public void createTicketPlaces() {
        Place place = null;
        for (int i = 0; i < MAX_SIZE; i++) {
            place = new Place(TYPE_NAME + ": sleeper", i + 1, PRICE);
            places.add(place);
        }
    }
}
