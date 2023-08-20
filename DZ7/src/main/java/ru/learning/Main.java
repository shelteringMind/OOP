package ru.learning;

import java.util.ArrayList;

public class Main {
    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        ArrayList<Company> companyList = new ArrayList<>();

        Company google = new Company(jobAgency, "Google", 120000);
        Company yandex = new Company(jobAgency, "Yandex", 95000);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000);

        companyList.add(google);
        companyList.add(yandex);
        companyList.add(geekBrains);

        Vacancy developer = new Vacancy(SpecializationType.Developer, "High", 110000);
        Vacancy programmer = new Vacancy(SpecializationType.Programmer, "Middle", 100000);
        Vacancy designer = new Vacancy(SpecializationType.Designer, "Intern", 90000);
        Vacancy manager = new Vacancy(SpecializationType.Manager, "Middle", 95000);

        google.createVacancy(developer);
        yandex.createVacancy(manager);
        geekBrains.createVacancy(designer);
        google.createVacancy(programmer);

        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Guru alekseev = new Guru("Alekseev");

        petrov.getSpecialization().add(SpecializationType.Developer);
        ivanov.getSpecialization().add(SpecializationType.Manager);
        sidorov.getSpecialization().add(SpecializationType.Designer);
        alekseev.getSpecialization().add(SpecializationType.Programmer);

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(alekseev);

        System.out.println("=".repeat(100));
        for (Company company : companyList) {
            for (int numVacancy = 0; numVacancy < company.getVacancyList().size(); numVacancy++) {
                company.needEmployee(numVacancy);
            }
            System.out.println("=".repeat(100));
        }
    }
}