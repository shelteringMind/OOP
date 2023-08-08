package ru.learning.controllers;

import ru.learning.models.*;
import ru.learning.views.UserView;

import java.time.LocalDate;
import java.util.List;

public class AppController {
    private final DataService dataService;

    private final StreamStudentGroups streamStudentGroups;
    private final StudentGroupService studentGroupService;
    private final UserView userView;

    public AppController(DataService dataService, StreamStudentGroups streamStudentGroups, StudentGroupService studentGroupService, UserView userView) {
        this.dataService = dataService;
        this.streamStudentGroups = streamStudentGroups;
        this.studentGroupService = studentGroupService;
        this.userView = userView;
    }

    public Student createStudent(String firstName, String lastName, String patronymic, LocalDate dateOfBirth){
        Student student = dataService.create(firstName,lastName,patronymic,dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.printOnConsole(userList);
        return student;
    }

    public void createStudentGroup(Tutor tutor, List<Student> students) {
        StudentGroup studentGroup = studentGroupService.createStudentGroup(tutor, students);
        userView.printOnConsole(studentGroup);
    }

    public void createStreamStudentGroup(List<StudentGroup> listSG){
        StreamStudentGroups ssg = streamStudentGroups.createStreamStudentGroup(listSG);
        userView.printOnConsole(ssg);
    }
}
