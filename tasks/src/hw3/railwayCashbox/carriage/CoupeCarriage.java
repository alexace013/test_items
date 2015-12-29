package hw3.railwayCashbox.carriage;

import hw3.railwayCashbox.place.ConditionPlace;
import hw3.railwayCashbox.place.Place;

public class CoupeCarriage extends Carriage implements ConditionPlace {

    private static final double PRICE = 93.27;          // price for coupe place
    private static final int MAX_SIZE = 36;             // max number places
    private static String TYPE_NAME = "Coupe-class";    // the type of this carriage

    public CoupeCarriage() {
        this.setCarriageType(TYPE_NAME);
        createCarriagePlaces();
    }

    @Override
    public void createCarriagePlaces() {

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
