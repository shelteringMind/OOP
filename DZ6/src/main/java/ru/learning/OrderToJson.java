package ru.learning;

import java.io.FileWriter;
import java.io.IOException;

public class OrderToJson extends Order{
    private Order order;

    public OrderToJson() {
    }

    public OrderToJson(Order order) {

        this.order = order;
    }

    public void saveToJson(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"orderID\":\"" + order.id + "\",\n");

            if(order.client instanceof Person) {
                writer.write("\"clientID\":\"" + order.client.personID + "\",\n");
            } else if (order.client instanceof Company) {
                writer.write("\"clientID\":\"" + order.client.companyID + "\",\n");
            } else {
                writer.write("\"clientID\":\"" + 0 + "\",\n");
            }

            writer.write("\"clientName\":\"" + order.client.name + "\",\n");
            writer.write("\"productID\":\"" + order.product.id + "\",\n");
            writer.write("\"product\":\"" + order.product.name + "\",\n");
            writer.write("\"qnt\":" + order.qnt+",\n");
            writer.write("\"price\":" + order.product.price+",\n");
            writer.write("\"cost\":" + order.cost+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
