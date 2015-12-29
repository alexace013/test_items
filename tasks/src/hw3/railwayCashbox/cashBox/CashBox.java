package hw3.railwayCashbox.cashBox;

/*
*  Написать приложение продажи ж/д билетов, участвуют билетная касса, билеты.
    Билеты продаются из начального пункта до конечного.
    Билеты продаются на один рейс, одного поезда.
    Купить билеты можно начиная с 45 суток до отправления, до момента отправления
* */

import hw3.railwayCashbox.ticket.Ticket;
import hw3.railwayCashbox.train.Train;
import utils.DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CashBox implements CashBoxI {

    private static final int LIMITATION_DAYS = 45;  // limit days before the ticket purchase
    private int countOfTickets;
    private List<Train> trains;
    private List<Ticket> tickets = new ArrayList<>();

    public CashBox(ArrayList<Train> trains) {
        createCeshBoxData(trains);
    }

    private void createCeshBoxData(ArrayList<Train> trains) {

        countOfTickets = 0;
        this.trains = trains;

        LocalDate dateNow = LocalDate.now();

        for (int day = 0; day < LIMITATION_DAYS; day++) {
            int currentYear = dateNow.getYear();
            Month currentMonth = dateNow.getMonth();
            int currentDay = dateNow.getDayOfMonth();
            LocalDate currentDate = LocalDate.of(currentYear, currentMonth, currentDay);
            createTrains(trains, currentDate);
        }

    }

    private void createTrains(ArrayList<Train> trains, LocalDate currentDate) {
        for (Train train : trains) {
            createCarriages(train, currentDate);
        }
    }

    private void createCarriages(Train train, LocalDate currentDate) {
        for (int index = 0; index < train.getCarriages().length; index++) {
            createTickets(train, index, currentDate);
        }
    }

    private void createTickets(Train train, int index, LocalDate currentDate) {

        for (int j = 0; j < train.carriages[index].places.size(); j++) {

            LocalTime time = LocalTime.of(train.getTime().getHour(),
                    train.getTime().getMinute());

            Ticket ticket = new Ticket(train.getTrainNumber(), train.getStartStation(),
                    train.getEndStation(), train.getDate().getYear(),
                    train.getDate().getMonth().getValue(), train.getDate().getDayOfMonth(),
                    train.getTime().getHour(), train.getTime().getMinute(),
                    train.carriages[index].getCarriageNumber(),
                    train.carriages[index].places.get(j).getPlaceNumber(),
                    train.carriages[index].places.get(j).getPlacePrice());

            DateAndTime dateAndTime = new DateAndTime(currentDate.getYear(),
                    currentDate.getMonth(), currentDate.getDayOfMonth(),
                    train.getTime().getHour(), train.getTime().getMinute());

            ticket.setDateAndTime(dateAndTime);

            tickets.add(countOfTickets, ticket);
            countOfTickets++;
        }
    }

    // Узнать информацию о всех билетах
    @Override
    public void allTicketsInfo(LocalDate date, int trainNumber) {

        for (Train train : trains) {

            if (train.getTrainNumber() == trainNumber) {

                System.out.println(String.format("Train %d, %s - %s, %d.%d.%d, %d:%d\n",
                        train.getTrainNumber(), train.getStartStation(), train.getEndStation(),
                        train.getDate().getYear(), train.getDate().getDayOfMonth(),
                        train.getDate().getMonth().getValue(), train.getTime().getHour(),
                        train.getTime().getMinute()));

                for (int i = 0; i < train.getCarriages().length; i++) {

                    System.out.println(String.format("(%d)%s ", i + 1,
                            train.carriages[i].getCarriageType()));

                    for (int j = 0; j < train.carriages[i].places.size(); j++) {

                        for (Ticket ticket : tickets) {

                            if (ticket.getTrainNumber() == trainNumber) {

                                if (ticket.isFreePlace()) {

                                    System.out.println(String.format("place %d ", ticket.getPlaceNumber()));

                                }

                            } else {
                                System.out.print("- ");
                            }
                        }
                    }
                }
            }
        }
    }

    // Узнать информацию о билете (номер поезда, дата отправления, вагон, место)
    @Override
    public Ticket ticketInfo() {
        return null;
    }

    // Купить билет (билет не продан, хватает денег у покупателя)
    @Override
    public boolean buyTicket(double price) {
        return false;
    }

    // Сдать билет (билет продан, есть деньги в кассе)
    @Override
    public boolean passTicket() {
        return false;
    }

    // Провести инкассацию (по кодовому слову)
    @Override
    public double CIT(String password) {
        return 0;
    }
}
