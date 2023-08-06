package ru.learning;

public class Main {
    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        InputOrderFromConsole inputOrder = new InputOrderFromConsole(order);
        OrderToJson orderToJson = new OrderToJson(order);

        inputOrder.inputFromConsole(new Company());
        orderToJson.saveToJson();
    }
}