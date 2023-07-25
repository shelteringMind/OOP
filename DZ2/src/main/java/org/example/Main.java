package org.example;

// Реализовать класс Market и все методы, которые он обязан реализовывать.
// Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour -
// помещает и удаляет человека из очереди, метод update обновляет состояние магазина
// (принимает и отдает заказы)

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Buyer> bList = new LinkedList<Buyer>();
        bList.add(new Buyer("Иванов Иван Иванович"));
        bList.add(new Buyer("Сергеев Семен Викторович"));
        bList.add(new Buyer("Алексеев Геннадий Петрович"));
        bList.add(new Buyer("Тимофеев Петр Кузьмич"));
        bList.add(new Buyer("Максимов Степан Валентинович"));

        List<Product> pList = new LinkedList<Product>();
        pList.add(new Product("T1","Телевизор",50,10000));
        pList.add(new Product("T2","Ноутбук",20,15000));
        pList.add(new Product("T3","Смартфон",100,5000));
        pList.add(new Product("T4","Кондиционер",70,17000));
        pList.add(new Product("T5","Наушники",200,1000));

        Market market = new Market("Место встречи.");
        for (Product product : pList) {
            market.acceptToMarket(product);
        }

        List<Order> oList = new LinkedList<Order>();
        oList.add(market.createOrder(bList.get(3)));
        oList.add(market.createOrder(bList.get(1)));
        oList.add(market.createOrder(bList.get(2)));
        oList.add(market.createOrder(bList.get(0)));
        oList.add(market.createOrder(bList.get(4)));

        for(Order order : oList){
            if(order.isMakeOrder()) {
                order.setTakeOrder(true);
                market.giveOrder(order);
                System.out.printf("В очереди осталось %d заказ(-а/-ов)\n",market.getQueue().size());
            }
        }
    }
}