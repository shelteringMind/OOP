package ru.learning.views;


import ru.learning.models.Table;
import ru.learning.presenters.View;
import ru.learning.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;



    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void showReservationTableResult(int reservationId){
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationId);
    }

    public void showChangeReservationTableResult(boolean result){
        if (result){
            System.out.println("Данные бронирования столика успешно изменены.");
        } else {
            System.out.println("Не удалось изменить данные бронирования столика.");
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: Необходимо разработать самостоятельно в рамках домашней работы.
     * Удаление старого резерва столика. Бронирование столика на новое время.
     * @param oldReservationTable номер резервирования
     * @param reservationDate дата резервирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void changeReservationTable(int oldReservationTable, Date reservationDate, int tableNo, String name){
        //TODO: Необходимо обратиться к наблюдателю ...
        observer.onChangeReservationTable(oldReservationTable, reservationDate, tableNo, name);
    }

}