package ru.learning;

public class Vacancy {
    private SpecializationType name;
    private String qualification;
    private int salary;

    public Vacancy(SpecializationType name, String qualification, int salary){
        this.name = name;
        this.qualification = qualification;
        this.salary = salary;
    }

    public SpecializationType getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public int getSalary() {
        return salary;
    }
}
