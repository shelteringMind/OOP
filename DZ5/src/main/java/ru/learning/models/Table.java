package ru.learning.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter;

    private final int no;

    {
        no = ++counter;
    }

    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public Reservation getReservation(Collection<Reservation> reservations, int reservationNo){
        for (Reservation reservation : reservations ){
            if (reservation.getId() == reservationNo){
                return reservation;
            }
        }
        return null;
    }

    public void removeReservation(int reservationNo){
        for (Reservation reservation : reservations ){
            if (reservation.getId() == reservationNo){
                reservations.remove(reservation);
                return;
            }
        }
    }

    public int getNo() { return no;}

    @Override
    public String toString() { return String.format("Столик #%d", no); }
}