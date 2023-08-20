package ru.learning;
public interface Publisher {
    void sendOffer(String companyName, Vacancy vacancy);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
}
