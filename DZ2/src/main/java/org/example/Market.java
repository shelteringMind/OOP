package org.example;

import java.io.IOException;
import java.util.*;

public class Market implements QueueBehaviour,MarketBehaviour{
    private static int idMarket;
    private final String nameMarket;

    private Queue<Buyer> queue = new LinkedList();

    private List<Product> products = new LinkedList<Product>();

    private List<Order> orders = new LinkedList<Order>();

    public Market(String nameMarket){
        this.nameMarket = nameMarket;
        idMarket++;
    }

    public String getNameMarket() {

        return nameMarket;
    }

    public Queue<Buyer> getQueue() {
        return queue;
    }
    public void acceptToMarket(Product product) {
        Iterator<Product> iter = products.iterator();
        Product prod;
        while(iter.hasNext()){
            prod = iter.next();
            if(prod.getArticul().equals(product.getArticul())){
                System.out.printf("%s добавлен в магазин.\n",product.getName());
                prod.setQuantity(prod.getQuantity() + product.getQuantity());
                return;
            }
        }
        products.add(product);
    }

    public boolean addInOrder(Product product) {
        Product prod = new Product();
        for (Product p:products) {
            if (product.getArticul().equals(p.getArticul())) {
                prod.clone(p);
                if (prod.getQuantity() >= product.getQuantity()) {
                    System.out.printf("Товар %s в количестве %d единиц добавлен в заказ.\n", product.getName()
                            ,product.getQuantity());
                    p.setQuantity(prod.getQuantity() - product.getQuantity());
                    return true;
                } else {
                    System.out.println("Такого количества данного вида товара в магазине нет!");
                    return false;
                }
            }
        }
        System.out.println("Этого товара в магазине нет!");
        return false;
    }

    public void takeInQueue(Buyer buyer) {

        this.queue.add(buyer);
    }

    public void releaseFromQueue() {

        this.queue.remove();
    }

    public Order createOrder(Buyer buyer) throws IOException {;
        Scanner in = new Scanner(System.in);
        List<Product> productList = new LinkedList<Product>();
        Product prod = new Product();
        int quantity;
        String art;
        while (true){;
            System.out.println("Введите артикул добавляемого в корзину товара " +
                    "(Для окончания сборки заказа введите 'q'): ");
            art = in.next();
            if (art.equals("q")) break;
            System.out.println("Введите количество добавляемого в корзину товара: ");
            quantity = in.nextInt();
            for (Product p:products) {
                if (art.equals(p.getArticul())) {
                    prod.clone(p);
                    prod.setQuantity(quantity);
                    if(addInOrder(prod)) {
                        productList.add(prod);
                    }
                    break;
                }
            }
        }
        Order order = new Order(buyer,productList);
        order.setMakeOrder(true);
        takeOrders(order);
        return order;
    }

    public void takeOrders(Order order) {
        orders.add(order);
        takeInQueue(order.getBuyer());
        order.setTakeOrder(true);
        System.out.printf("Заказ клиента %s под номером %d собран и готов к получению.\n"
                ,order.getBuyer().getFio(),order.getId());
    }

    public void giveOrder(Order order) {
        System.out.printf("Клиент %s получил свой заказ номер %d.\n"
                ,order.getBuyer().getFio(),order.getId());
        if(order.isTakeOrder()) {
            orders.remove(order);
            releaseFromQueue();
        }
    }
}
