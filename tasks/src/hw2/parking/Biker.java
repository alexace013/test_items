package hw2.parking;

/**
 * class Biker
 methods
 - buyMotorcycle
 - sellMotorcycle
 - fixMotorcycle
 */

public class Biker {

    private String brand;
    private Integer parkPlace;

    public Biker() {}

    public Biker(String brand) {
        this.brand = brand;
    }

    public Integer getParkPlace() {
        return parkPlace;
    }

    public void setParkPlace(Integer parkPlace) {
        this.parkPlace = parkPlace;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}