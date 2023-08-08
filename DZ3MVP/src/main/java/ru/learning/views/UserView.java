package ru.learning.views;

import ru.learning.models.StreamStudentGroups;
import ru.learning.models.StudentGroup;
import ru.learning.models.User;

import java.util.List;

public class UserView {

    public void printOnConsole(List<User> list) {
        System.out.println("Актуальный список студентов:");
        System.out.println("****************************");
        for(User user : list){
            System.out.println(user);
        }
        System.out.println("****************************\n");
    }

    public void printOnConsole(StudentGroup group) {
        System.out.println("|*| Группа |*|");
        System.out.println(group);
    }

    public void printOnConsole(StreamStudentGroups listStream) {
        System.out.println("Отсортированный по количеству групп список потов: ");
        System.out.println("****************************");
        for(StudentGroup sg : listStream){
            System.out.println(sg);
        }
        System.out.println("****************************\n");
    }
}
