package ru.learning;

public class Product {

    private static int productId;
    protected int id;
    protected String name;
    protected double price;

    public Product(){

        this.id = ++productId;
    }

    public Product(String name, double price){

        this.name=name;
        this.price = price;
    }
}
