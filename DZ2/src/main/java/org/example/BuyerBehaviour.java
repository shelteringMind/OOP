package org.example;

public interface BuyerBehaviour {
    void setMakeOrder(boolean status);
    void setTakeOrder(boolean status);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
