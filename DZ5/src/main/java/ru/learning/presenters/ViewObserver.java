package ru.learning.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);

}