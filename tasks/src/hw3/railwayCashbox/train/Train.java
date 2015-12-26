package hw3.railwayCashbox.train;

import hw3.railwayCashbox.carriage.Carriage;

public class Train {

    private int trainNumber;
    private String startStation;
    private String endStation;
    Carriage[] carriages;

    public Train(int trainNumber, String startStation, String endStation, Carriage[] carriages) {
        this.trainNumber = trainNumber;
        this.startStation = startStation;
        this.endStation = endStation;
        this.carriages = carriages;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Carriage[] getCarriages() {
        return carriages;
    }

    public void setCarriages(Carriage[] carriages) {
        this.carriages = carriages;
    }

    @Override
    public String toString() {
        return String.format("Train №%d, way from %s to %s, carriages: %d",
                getTrainNumber(), getStartStation(), getEndStation(), getCarriages().length);
    }
}
