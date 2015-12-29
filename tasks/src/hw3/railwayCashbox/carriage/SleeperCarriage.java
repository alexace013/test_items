package hw3.railwayCashbox.carriage;

import hw3.railwayCashbox.place.ConditionPlace;
import hw3.railwayCashbox.place.Place;

public class SleeperCarriage extends Carriage implements ConditionPlace {

    private static final double PRICE = 146.51;     // price for sleeper place
    private static final int MAX_SIZE = 18;         // max number places
    private static String TYPE_NAME = "Sleeper";    // the type of this carriage

    public SleeperCarriage() {
        this.setCarriageType(TYPE_NAME);
        createCarriagePlaces();
    }

    @Override
    public void createCarriagePlaces() {

        Place place = null;

        for (int i = 0; i < MAX_SIZE; i++) {
            place = new Place(TYPE_NAME + ": sleeper", i + 1, PRICE);
            places.add(place);
        }

    }
    
}
