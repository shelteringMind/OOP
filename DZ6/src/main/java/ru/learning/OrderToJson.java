package ru.learning;

import java.io.FileWriter;
import java.io.IOException;

public class OrderToJson{
    private Order order;

    public OrderToJson() {
    }

    public OrderToJson(Order order) {
        this.order = order;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientID\":\"" + order.getClient().getId() + "\",\n");
            writer.write("\"clientName\":\"" + order.getClient().getName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct().getName() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt()+",\n");
            writer.write("\"price\":" + order.getProduct().getPrice()+",\n");
            writer.write("\"cost\":" + order.getCost()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
