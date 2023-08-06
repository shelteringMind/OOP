package ru.learning;

import java.util.Scanner;

public class InputOrderFromConsole extends Order{
    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public InputOrderFromConsole() {
    }

    public InputOrderFromConsole(Order order) {

        this.order = order;
    }

    public void inputFromConsole(){
        if(order.client instanceof Person) {
            order.client.name = processInput("Имя клиента: ");
            order.product.name = processInput("Продукт: ");
            order.qnt = Integer.parseInt(processInput("Кол-во: "));
            order.product.price = Double.parseDouble(processInput("Цена: "));
            order.cost = order.product.price * order.qnt;
        } else if (order.client instanceof Company){
            order.client.name = processInput("Наименование организации: ");
            order.product.name = processInput("Продукт: ");
            order.qnt = Integer.parseInt(processInput("Кол-во: "));
            order.product.price = Double.parseDouble(processInput("Цена: "));
            order.cost = order.product.price * order.qnt;
        }
    }

    String processInput(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}
