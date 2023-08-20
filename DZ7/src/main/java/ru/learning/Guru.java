package ru.learning;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Guru implements Observer{

    private String name;
    int salary = 160000;

    private ArrayList<SpecializationType> specialization;

    public Guru(String name) {
        this.name = name;
        this.specialization = new ArrayList<>();
    }

    public ArrayList<SpecializationType> getSpecialization() {
        return specialization;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.getSpecialization().contains(vacancy.getName()) && this.salary <= vacancy.getSalary()){
            System.out.printf("Guru %s: Мне нужна эта работа! (company: %s; Vacancy: %s; salary: %d)\n", name,
                    nameCompany, vacancy.getName(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else if(!this.getSpecialization().contains(vacancy.getName())) {
            System.out.printf("Guru %s: У меня иная специализация! (company: %s; Vacancy: %s; salary: %d)\n", name,
                    nameCompany, vacancy.getName(), vacancy.getSalary());
        }
        else {
            System.out.printf("Guru %s: Я найду работу получше! (company: %s; Vacancy: %s; salary: %d)\n", name,
                    nameCompany, vacancy.getName(), vacancy.getSalary());
        }
    }
}
