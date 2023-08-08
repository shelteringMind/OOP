package ru.learning.presenters;

import ru.learning.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final View view;
    private final Model model;

    public BookingPresenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return model.loadTables();
    }

    public void showTables(){
        view.showTables(loadTables());
    }

    private void showReservationTableResult(int reservationId){
        view.showReservationTableResult(reservationId);
    }

    private void showChangeReservationTableResult(int newReservationId){
        view.showChangeReservationTableResult(newReservationId);
    }
    /**
     * Произошло событие, пользователь нажал на кнопку резерва столика
     * @param reservationDate дата резервирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationId = model.reservationTable(reservationDate, tableNo, name);
        showReservationTableResult(reservationId);
    }
    /**
     * Произошло событие, пользователь нажал на кнопку изменения резерва столика
     * @param oldReservationTable номер резервирования
     * @param reservationDate дата резервирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void onChangeReservationTable(int oldReservationTable, Date reservationDate, int tableNo, String name){
        int newReservationId = model.changeReservationTable(oldReservationTable, reservationDate,tableNo, name);
        showChangeReservationTableResult(newReservationId);
    }
}