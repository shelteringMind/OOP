package ru.learning.models;

import java.time.LocalDate;

public class Student extends User{
    public Student (String firstName, String lastName, String patronymic, LocalDate dateOfBirth){
        super(firstName,lastName, patronymic, dateOfBirth);
    }

    @Override
    public  String toString() {
        return "Student: << " +
                "first name: " + super.getFirstName() + " || " +
                "last name: " + super.getLastName() + " || " +
                "patronymic: " + super.getPatronymic() + " || " +
                "date of Birth: " + super.getDateOfBirth() +
                " >>";
    }
}
