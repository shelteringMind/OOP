package ru.learning.models;

import ru.learning.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить список всех столиков в ресторане
     * @return список столиков
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;

    }

    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return  reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * TODO: Необходимо разработать самостоятельно в рамках домашней работы.
     * Отмена старой брони по номеру. Резервирование столика на новую дату и время.
     * @param oldReservationNo номер резервирования
     * @param reservationDate дата резервирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return удалось или нет изменить данные резервирования
     */
    public int changeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String name){
        for (Table table : loadTables()) {
            if (table.getReservation(table.getReservations(),oldReservationNo) != null){
                table.removeReservation(oldReservationNo);
                return reservationTable(reservationDate,tableNo,name);
            }
        }
        return -1;
    }
}

