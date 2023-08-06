package ru.learning;

public class Company extends Client{
    private static int id;
    public Company(){

        super.companyID = ++id;
    }

    public Company(String name){

        super(name);
    }

}
