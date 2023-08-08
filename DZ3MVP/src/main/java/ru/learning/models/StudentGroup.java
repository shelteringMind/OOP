package ru.learning.models;

import java.util.List;

public class StudentGroup {
    private List<Student> students;
    private Tutor tutor;

    public StudentGroup(Tutor tutor,List<Student> students){
        this.students = students;
        this.tutor = tutor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString(){
        return "Students group: << " +
                "students: " + students +
                " || " + "tutor: " + tutor +
                " >>";
    }
}
