package ru.learning.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;

    private final int id;

    private final Date date;

    private final String name;

    {
        id = ++counter;
    }

    public int getId() { return id; }

    public Date getDate() { return date; }

    public String getName() { return name; }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }
}
