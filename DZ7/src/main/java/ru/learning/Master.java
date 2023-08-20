package ru.learning;

import java.util.ArrayList;

public class Master implements Observer {

    private String name;
    int salary = 80000;

    private ArrayList<SpecializationType> specialization;

    public Master(String name) {

        this.name = name;
        this.specialization = new ArrayList<>();
    }

    public ArrayList<SpecializationType> getSpecialization() {
        return specialization;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.getSpecialization().contains(vacancy.getName()) && this.salary <= vacancy.getSalary()){
            System.out.printf("Master %s: Мне нужна эта работа! (company: %s; Vacancy: %s; salary: %d)\n", name,
                    nameCompany, vacancy.getName(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else if(!this.getSpecialization().contains(vacancy.getName())) {
            System.out.printf("Master %s: У меня иная специализация! (company: %s; Vacancy: %s; salary: %d)\n", name,
                    nameCompany, vacancy.getName(), vacancy.getSalary());
        }
        else {
            System.out.printf("Master %s: Я найду работу получше! (company: %s; Vacancy: %s; salary: %d)\n", name,
                    nameCompany, vacancy.getName(), vacancy.getSalary());
        }
    }
}