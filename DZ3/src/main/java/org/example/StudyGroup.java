package org.example;

import java.util.List;
import java.util.Scanner;

public class StudyGroup extends Student{
    private String numberGroup;
    private int quantityOfStud;
    private List<Student> students;

    public StudyGroup(String numberGroup,int numOfStud,List<Student> stds){
        this.numberGroup = numberGroup;
        this.quantityOfStud = numOfStud;
        this.students = stds;
    };
    public StudyGroup(String numberGroup){

        this(numberGroup,0,null);
    }

    public StudyGroup() {
    }

    public String getNumberGroup() {

        return numberGroup;
    }

    public int getNumOfStud() {

        return quantityOfStud;
    }

    public List<Student> getStudents() {

        return students;
    }

    public void setStudents(List<Student> students) {
        Scanner in = new Scanner(System.in);
        String fio;
        int age;
        for(Student st : students){
            System.out.println("Введите ФИО студента: ");
            fio = in.next();
            System.out.println("Введите возраст студента: ");
            age = in.nextInt();
            st.setFio(fio);
            st.setAge(age);
        }
    }
}
