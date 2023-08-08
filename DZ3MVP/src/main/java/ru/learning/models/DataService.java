package ru.learning.models;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class DataService {
    private List<User> users;
    public  DataService(List<User> users) {
        this.users = users;
    }
    public DataService() {
        this.users = new ArrayList<>();
    }
    public List<User> getAll() {
        return users;
    }
    public Student create(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        Student student = new Student(firstName, lastName, patronymic, dateOfBirth);
        this.users.add(student);
        return student;
    }
}
