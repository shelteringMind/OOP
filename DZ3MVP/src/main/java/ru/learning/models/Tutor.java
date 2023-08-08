package ru.learning.models;

import java.time.LocalDate;

public class Tutor extends User {
    public Tutor(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, lastName,patronymic, dateOfBirth);
    }
}
