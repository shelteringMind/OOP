package org.example;

public class Product{
    private String articul;
    private String name;
    private int quantity;

    private double price;
    private Product product;

    public Product(String art,String name,int quantity,double price){
        this.articul = art;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(){

        this(null,null,0,0.0);
    }

    public String getArticul() {

        return articul;
    }

    public String getName() {

        return name;
    }

    public int getQuantity() {

        return quantity;
    }

    public double getPrice() {
        return  price;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public void clone(Product product) {
        this.articul = product.getArticul();
        this.name = product.getName();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
    }
}
