package ru.learning;

public class Order{
    private static int orderId;
    protected int id;
    protected Client client;
    protected Product product;
    protected int qnt;
    protected double cost;

    public Order() {
    }

    public Order(Person person, Product product){
        this.id = ++orderId;
        this.client = person;
        this.product = product;
    }

    public Order(Company company,Product product){
        this.id = ++orderId;
        this.client = company;
        this.product = product;
    }

    public Order(Client client, Product product, int qnt, double price) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.cost = 0.0;
    }
}
