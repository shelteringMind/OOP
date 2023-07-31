package org.example;

public class RelocateContent<T extends Fruit> extends Box<T>{

    private final Box<T> from;
    private final Box<T> to;
    private final int quantity;

    public RelocateContent(Box<T> from,Box<T> to,int quantity){
        this.from=from;
        this.to=to;
        this.quantity=quantity;
    }

    public void exec(){
        T element;
        if(from.getQuantity()>=quantity){
            for (int iter = 0;iter < quantity;iter++){
                element=from.getElements().get(0);
                to.addFruitToBox(element);
                from.setQuantity(from.getQuantity()-1);
                from.setBoxWeight(from.getBoxWeight()-from.getElements().remove(0).getWeightFruit());
            }
        } else{
            System.out.println("Перенос такого количества содержимого невозможен... \n" +
                    "Уменьшите количесво, либо выберите другую коробку.");
        }
    }

}
