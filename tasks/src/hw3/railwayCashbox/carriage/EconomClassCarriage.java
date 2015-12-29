package hw3.railwayCashbox.carriage;

import hw3.railwayCashbox.place.ConditionPlace;
import hw3.railwayCashbox.place.Place;

public class EconomClassCarriage extends Carriage implements ConditionPlace {

    private static final double PRICE = 57.9;           // price for econom-class place
    private static final int MAX_SIZE = 54;             // max number places
    private static String TYPE_NAME = "Econom-Class";   // the type of this carriage

    public EconomClassCarriage() {
        this.setCarriageType(TYPE_NAME);
        createCarriagePlaces();
    }

    /**
     * @info Coupe (odd № 1-35 - lower, even № 2-36 - upper)
     * @info Side (odd places № 37-53 - lower, even № 38-54 - upper)
     */
    @Override
    public final void createCarriagePlaces() {

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
