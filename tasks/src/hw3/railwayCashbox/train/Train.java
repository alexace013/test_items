package hw3.railwayCashbox.train;

import hw3.railwayCashbox.carriage.Carriage;
import hw3.railwayCashbox.carriage.CoupeCarriage;
import hw3.railwayCashbox.carriage.EconomClassCarriage;
import hw3.railwayCashbox.carriage.SleeperCarriage;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Alexander Bakhin
 */

public class Train implements ConditionTrain {

    public Carriage[] carriages;
    private int trainNumber;
    private String startStation;
    private String endStation;
    private LocalTime time;
    private LocalDate date;

    /**
     * @param trainNumber     - number of your train
     * @param startStation    - dispatch station
     * @param endStation      - arrival station
     * @param date            - departure date your train
     * @param time            - Departure time your train
     * @param carriagesNumber - the number of carriages in the train
     */
    public Train(int trainNumber, String startStation, String endStation,
                 LocalDate date, LocalTime time, int carriagesNumber) {
        this.trainNumber = trainNumber;
        this.startStation = startStation;
        this.endStation = endStation;
        this.date = date;
        this.time = time;
        this.carriages = new Carriage[carriagesNumber];
        addCarriages(carriagesNumber);
    }

    /**
     * @param trainNumber  - number of your train
     * @param startStation - dispatch station
     * @param endStation   - arrival station
     * @param date         - departure date your train
     * @param time         - Departure time your train
     * @param carriages    - an array of carriages
     */
    public Train(int trainNumber, String startStation, String endStation,
                 LocalDate date, LocalTime time, Carriage[] carriages) {
        this.trainNumber = trainNumber;
        this.startStation = startStation;
        this.endStation = endStation;
        this.date = date;
        this.time = time;
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String setTime(int hours, int minutes, int seconds) {
        return String.format("time: %d:%d:%d",
                time.getHour() + time.getMinute() + time.getSecond());
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @param index - input the index to show a carriage with an array(@param carriages)
     * @return int -  the places size in this carriage
     */
    public int carriageIndex(int index) {
        return carriages[index].getPlaceSize();
    }

    /**
     * @return String - the all information about carriages
     */
    public String getAllCarriages() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < carriages.length; i++) {
            builder.append(String.format("number carriage: %d, type: %s, place: %d\n",
                    carriages[i].getCarriageNumber(), carriages[i].getCarriageType(),
                    carriages[i].getPlaceSize()));
        }

        return builder.toString();

    }

    @Override
    public Carriage[] addCarriages(int carriagesNumber) {

        if (carriagesNumber < 0) {
            System.err.println(String.format("error: %s",
                    new IndexOutOfBoundsException("carriagesNumber < 0.").toString()));
            return null;
        } else {

            final int FIRST_TYPE = (carriagesNumber / 2);
            final int SECOND_TYPE = (carriagesNumber / 4);

            for (int i = 0; i < SECOND_TYPE; i++) {
                carriages[i] = new SleeperCarriage();
                carriages[i].setCarriageNumber(i + 1);
            }

            for (int i = SECOND_TYPE; i < FIRST_TYPE; i++) {
                carriages[i] = new CoupeCarriage();
                carriages[i].setCarriageNumber(i + 1);
            }

            for (int i = FIRST_TYPE; i < carriages.length; i++) {
                carriages[i] = new EconomClassCarriage();
                carriages[i].setCarriageNumber(i + 1);
            }

        }

        return carriages;
    }

    @Override
    public String toString() {
        return String.format("Train №%d, way from %s to %s, carriages: %d",
                getTrainNumber(), getStartStation(), getEndStation(), getCarriages().length);
    }

}
