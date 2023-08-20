package ru.learning;

import java.util.ArrayList;
import java.util.Random;

public class Company {

    Publisher jobAgency;

    private String name;

    private int maxSalary;

    private ArrayList<Vacancy> vacancylist;

    public ArrayList<Vacancy> getVacancyList() {
        return vacancylist;
    }

    public Company(Publisher jobAgency, String name, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.vacancylist = vacancylist;
    }

    public void needEmployee(int numVacancy){
        jobAgency.sendOffer(name, vacancylist.get(numVacancy));
    }

    public void createVacancy(Vacancy vacancy){
        if(vacancylist == null){
            vacancylist = new ArrayList<Vacancy>();
            vacancylist.add(vacancy);
        } else {
            vacancylist.add(vacancy);
        }
    }

    public void removeVacancy(Vacancy vacancy){
        if(vacancylist == null){
            return;
        } else {
            vacancylist.remove(vacancy);
        }
    }

}
