package org.example;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> elements;
    private int maxWeightBox;

    private int boxWeight;

    private int quantity;

    public Box(ArrayList<T> box){

        this.elements = box;
    }

    public Box(){

        this.elements = new ArrayList<T>();
    }

    public int getQuantity() {

        return quantity;
    }

    public int getMaxWeightBox() {

        return maxWeightBox;
    }

    public int getBoxWeight() {

        return boxWeight;
    }

    public ArrayList<T> getElements() {
        return elements;
    }

    public void setElements(ArrayList<T> elements) {
        this.elements = elements;
    }

    public void setBoxWeight(int boxWeight) {
        this.boxWeight = boxWeight;
    }

    public void setElement(T element) {

        this.addFruitToBox(element);
    }

    public void setElement(T element,int index) {

        this.elements.add(index,element);
    }

    public void setMaxWeightBox(int maxWeightBox) {

        this.maxWeightBox = maxWeightBox;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public void addFruitToBox(T element){
        elements.add(element);
        this.boxWeight += element.getWeightFruit();
        this.quantity++;
    }

    public boolean compareWeightBoxes(Box<? extends Fruit> box){

        return this.boxWeight == box.getBoxWeight();
    }
}

