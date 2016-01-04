package hw3.railwayCashbox.carriage;

import hw3.railwayCashbox.place.Place;
import java.util.ArrayList;
import java.util.List;

public class Carriage {

    public List<Place> places = new ArrayList<Place>();
    private int carriageNumber;
    private String carriageType;

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public String getCarriageType() {
        return carriageType;
    }

    public void setCarriageType(String carriageType) {
        this.carriageType = carriageType;
    }

    public int getPlaceSize() {
        return places.size();
    }


    public Place getPlace(int index) {
        return places.get(index);
    }

    /**
     * @return String - all information about places
     */
    public String getAllPlacesToString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < places.size(); i++) {
            builder.append(places.get(i).toString() + "\n");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return String.format("carriage type - %s, carriage № %d",
                getCarriageType(), getCarriageNumber());
    }
}
