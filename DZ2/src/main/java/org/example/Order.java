package org.example;

import java.util.List;

public class Order extends Buyer implements BuyerBehaviour{

    private static int numOrder;
    private int id;

    private Buyer buyer;

    private List<Product> productsToOrder;
    protected boolean makeOrder = false;
    protected boolean takeOrder = false;

    public Order(Buyer buyer, List<Product> products){
        this.buyer = buyer;
        this.id = ++numOrder;
        this.productsToOrder = products;
    }

    public Order(Buyer buyer) {

        this(buyer,null);
    }

    public boolean isMakeOrder() {

        return makeOrder;
    }

    public boolean isTakeOrder() {

        return takeOrder;
    }

    public void setMakeOrder(boolean status) {

        makeOrder = status;
    }

    public void setTakeOrder(boolean status) {

        takeOrder = status;
    }

    public Buyer getBuyer() {

        return buyer;
    }

    public int getId() {
        return id;
    }
}
