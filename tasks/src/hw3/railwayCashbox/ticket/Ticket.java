package hw3.railwayCashbox.ticket;

import utils.DateAndTime;

import java.time.LocalDateTime;
import java.util.Random;

/**
 *  Билет содержит следующие поля:
 *  1. Пункт отбытия
 *  2. Пункт назначения
 *  3. Дата и время отбытия
 *  4. Номер поезда
 *  5. Номер вагона
 *  6. Номер места
 *  7. Цена
 */

public class Ticket {

    private int id;
    private boolean freePlace;
    private String startStation;
    private String endStation;
    private DateAndTime dateAndTime;
    private int trainNumber;
    private int carriageNumber;
    private int placeNumber;
    private double price;

    public Ticket(int trainNumber, String startStation, String endStation,
                  int year, int month, int day, int hours, int minutes,
                  int carriageNumber, int placeNumber,
                  double price) {
        this.trainNumber = trainNumber;
        this.startStation = startStation;
        this.endStation = endStation;
        this.dateAndTime = new DateAndTime(year, month, day, hours, minutes);
        this.carriageNumber = carriageNumber;
        this.placeNumber = placeNumber;
        this.price = price;
//        this.id = (int)(Math.random() * hashCode());
        this.id = new Random(1075).nextInt() * (int)(Math.random() * 1721);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFreePlace() {
        return freePlace;
    }

    public void setFreePlace(boolean freePlace) {
        this.freePlace = freePlace;
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

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateTime) {
    }
}
