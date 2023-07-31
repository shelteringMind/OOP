package org.example;
public abstract class Fruit{
    private String name;
    private String sortFruit;
    private int weightFruit;

    public Fruit(String name,String sort, int weight){
        this.name = name;
        this.sortFruit = sort;
        this.weightFruit = weight;
    }
    public Fruit(){
    }

    public int getWeightFruit() {

        return weightFruit;
    }

    public String getSortFruit() {

        return sortFruit;
    }

    public String getName() {

        return name;
    }

}
