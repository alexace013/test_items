package hw3.railwayCashbox.carriage;

import hw3.railwayCashbox.place.Condition;
import hw3.railwayCashbox.place.Place;

public class CoupeCarriage extends Carriage implements Condition {

    private static final double PRICE = 93.27;
    private static final int MAX_SIZE = 36;
    private static String TYPE_NAME = "Coupe-class";

    public CoupeCarriage() {
        this.setCarriageType(TYPE_NAME);
        createTicketPlaces();
    }

    @Override
    public void createTicketPlaces() {
        Place place = null;
        for (int i = 0; i < MAX_SIZE; i++) {
            int placeNumber = i + 1;
            if (i % 2 == 0) {
                place = new Place(TYPE_NAME + ": upper place", placeNumber, PRICE);
                places.add(place);
            } else {
                place = new Place(TYPE_NAME + ": bottom place", placeNumber, PRICE);
                places.add(place);
            }
        }
    }
}
