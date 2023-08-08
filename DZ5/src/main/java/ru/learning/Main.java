package ru.learning;

import ru.learning.models.TableModel;
import ru.learning.presenters.BookingPresenter;
import ru.learning.presenters.Model;
import ru.learning.presenters.View;
import ru.learning.views.BookingView;

import java.util.Date;

public class Main {

    /**
     * TODO: Домашняя работа
     *  метод changeReservationTable должен заработать!!!
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Станислав");

        view.changeReservationTable(1001, new Date(), 4, "Станислав");
        view.changeReservationTable(1003, new Date(), 5, "Станислав");

    }

}
