package hw3.railwayCashbox.place;

public class Place {

    private int placeNumber;
    private double placePrice;
    private String placeType;
    private boolean ticketBuy = true;   // if true, ticket  can be purchased

    public Place(String placeType, int placeNumber, double placePrice) {
        this.placeType = placeType;
        this.placeNumber = placeNumber;
        this.placePrice = placePrice;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public double getPlacePrice() {
        return placePrice;
    }

    public void setPlacePrice(double placePrice) {
        this.placePrice = placePrice;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public boolean isTicketBuy() {
        return ticketBuy;
    }

    public void setTicketBuy(boolean ticketBuy) {
        this.ticketBuy = ticketBuy;
    }

    @Override
    public String toString() {
        return String.format("type - %s, № %d, price: %.2f",
                getPlaceType(), getPlaceNumber(), getPlacePrice());
    }
}
