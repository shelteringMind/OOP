package ru.learning.models;

import java.time.LocalDate;

public abstract class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public User(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public  String toString() {
        return "Student: << " +
                "first name: " + firstName + " || " +
                "last name: " + lastName + " || " +
                "patronymic: " + patronymic + " || " +
                "date of Birth: " + dateOfBirth +
                " >>";
    }
}
