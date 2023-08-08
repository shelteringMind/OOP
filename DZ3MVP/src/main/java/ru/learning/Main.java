package ru.learning;

import ru.learning.controllers.AppController;
import ru.learning.models.*;
import ru.learning.views.UserView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        StreamStudentGroups ssg = new StreamStudentGroups();
        StudentGroupService studentGroupService = new StudentGroupService();
        UserView userView = new UserView();
        AppController userController = new AppController(dataService, ssg, studentGroupService, userView);

        Student student1 =  userController.createStudent("AAA1", "BBB1", "CCC1", LocalDate.now());
        Student student2 = userController.createStudent("AAA2", "BBB2", "CCC2", LocalDate.now());
        List<Student> students = new ArrayList<>(List.of(new Student[]{student1, student2}));
        userController.createStudentGroup(new Tutor("AAA", "BBB", "CCC", LocalDate.now()),
                students);


    }
}