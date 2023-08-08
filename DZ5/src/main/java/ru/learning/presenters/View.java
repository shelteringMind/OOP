package ru.learning.presenters;

import ru.learning.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Метод позволяет установить наблюдателя, отслеживающего действия конечного пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);


    /**
     * Зарезервировать столик на дату
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     */
    void reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * Изменить резерв столика по номеру
     * @param oldReservationNo номер резерва
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     */
    void changeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String name);

    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    void showReservationTableResult(int reservationId);

    void showChangeReservationTableResult(int newReservationId);

}

