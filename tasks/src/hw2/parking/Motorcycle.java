package hw2.parking;

public class Motorcycle {

    private String brand;
    private double price;   // price for this motorcycle
    private boolean condition;  // if condition is false = > motorcycle is broken
    private Biker biker;
    private Integer parkPlace;

    public Motorcycle(String brand, double price) {
        this.brand = brand;
        this.price = price;
        condition = true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public Integer getParkPlace() {
        return parkPlace;
    }

    public void setParkPlace(Integer parkPlace) {
        this.parkPlace = parkPlace;
    }

    public Biker getBiker() {
        return biker;
    }

    public void setBiker(Biker biker) {
        this.biker = biker;
    }

}
