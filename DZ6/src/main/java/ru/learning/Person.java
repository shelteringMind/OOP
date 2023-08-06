package ru.learning;

public class Person extends Client{
    private static int id;

    public Person(){

        super.personID = ++id;
    }

    public Person(String name){

        super(name);
    }
}
