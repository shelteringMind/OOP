package ru.learning.models;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public StudentGroup createStudentGroup(Tutor tutor, List<Student> students){
        studentGroup = new StudentGroup(tutor, students);
        return studentGroup;
    }
    public Student getStudentFromStudentGroup(String firstName, String lastName, String patronymic){
        List<Student> result = new ArrayList<>();
        for(Student student : studentGroup.getStudents()) {
            if(student.getFirstName().equalsIgnoreCase(firstName)
                && student.getLastName().equalsIgnoreCase(lastName)
                && student.getPatronymic().equalsIgnoreCase(patronymic)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            System.out.printf(" Студент с ФИО << %s %s %s >> не найден\n", firstName, lastName, patronymic);
        }
        if(result.size() != 1){
            System.out.println("Найдено более одного студента с указанным ФИО.");
        }
        return result.get(0);

    }
}
