package ru.learning;

public class Main {
    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Company corp = new Company();
        Product product = new Product();
        Order order = new Order(corp,product);
        InputOrderFromConsole inputOrder = new InputOrderFromConsole(order);
        OrderToJson orderToJson = new OrderToJson(order);

        inputOrder.inputFromConsole();
        orderToJson.saveToJson("order.json");
    }
}