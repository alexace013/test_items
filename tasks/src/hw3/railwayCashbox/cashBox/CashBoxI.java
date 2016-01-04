package hw3.railwayCashbox.cashBox;

import hw3.railwayCashbox.ticket.Ticket;

import java.time.LocalDate;

/**
 * Касса позволяет:
 1. Узнать информацию о всех билетах
 2. Узнать информацию о билете (номер поезда, дата отправления, вагон, место)
 3. Купить билет (билет не продан, хватает денег у покупателя)
 4. Сдать билет (билет продан, есть деньги в кассе)
 5. Провести инкассацию (по кодовому слову)
 */

public interface CashBoxI {

    void allTrainTicketsInformation(LocalDate date, int trainNumber);
    Ticket ticketInfo();
    boolean buyTicket(double price);
    boolean passTicket();
    double CIT(String password); // CIT - Cash-in-transit

}
