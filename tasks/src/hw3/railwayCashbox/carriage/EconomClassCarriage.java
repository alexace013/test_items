package hw3.railwayCashbox.carriage;

import hw3.railwayCashbox.place.Condition;
import hw3.railwayCashbox.place.Place;

public class EconomClassCarriage extends Carriage implements Condition {

    private static final double PRICE = 57.9;
    private static final int MAX_SIZE = 54;
    private static String TYPE_NAME = "Econom-Class";

    public EconomClassCarriage() {
        this.setCarriageType(TYPE_NAME);
        createTicketPlaces();
    }

    /*
     * Coupe (odd № 1-35 - lower, even № 2-36 - upper)
     * Side (odd places № 37-53 - lower, even № 38-54 - upper)
     * */
    @Override
    public final void createTicketPlaces() {
        Place place = null;
        for (int i = 0; i < MAX_SIZE; i++) {
            int placeNumber = i + 1; // created place number from 1 to 54
            if (i < 37) {
                if (i % 2 == 0) {
                    place = new Place(TYPE_NAME + ": upper place", placeNumber, PRICE);
                    places.add(place);
                } else {
                    place = new Place(TYPE_NAME + ": bottom place", placeNumber, PRICE);
                    places.add(place);
                }
            } else {
                if (i % 2 == 0) {
                    place = new Place(TYPE_NAME + ": upper side place", placeNumber, PRICE);
                    places.add(place);
                } else {
                    place = new Place(TYPE_NAME + ": bottom side place", placeNumber, PRICE);
                    places.add(place);
                }
            }
        }
    }

}
