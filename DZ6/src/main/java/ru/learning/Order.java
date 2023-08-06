package ru.learning;

public class Order{
    private Client client = new Client();
    private Product product = new Product();
    private int qnt;
    private double cost;

    public Order() {
    }

    public Order(Client client, Product product, int qnt, double price) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.cost = 0.0;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
