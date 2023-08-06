package ru.learning;

import java.util.Scanner;

public class InputOrderFromConsole{

    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public InputOrderFromConsole() {
    }

    public InputOrderFromConsole(Order order) {
        this.order = order;
    }

    public void inputFromConsole(Company company){
        order.getClient().setName(processInput("Наименование организации: "));
        order.getProduct().setName(processInput("Продукт: "));
        order.setQnt(Integer.parseInt(processInput("Кол-во: ")));
        order.getProduct().setPrice(Double.parseDouble(processInput("Цена: ")));
        order.setCost(order.getProduct().getPrice()*order.getQnt());
    }

    public void inputFromConsole(Person person){
        order.getClient().setName(processInput("Имя клиента: "));
        order.getProduct().setName(processInput("Продукт: "));
        order.setQnt(Integer.parseInt(processInput("Кол-во: ")));
        order.getProduct().setPrice(Double.parseDouble(processInput("Цена: ")));
        order.setCost(order.getProduct().getPrice()*order.getQnt());
    }

    String processInput(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}
