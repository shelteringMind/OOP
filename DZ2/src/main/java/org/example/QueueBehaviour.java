package org.example;

public interface QueueBehaviour {
    void takeInQueue(Buyer buyer);
    void releaseFromQueue();
    void takeOrders(Order order);
    void giveOrder(Order order);
}
