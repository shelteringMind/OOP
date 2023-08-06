package ru.learning;

public class Person extends Client{

    protected static int PersonID = 1;
    public Person(){
    }

    public Person(String name){
        super(name);
    }
}
