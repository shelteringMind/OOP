package org.example;

public class HotDrink{
    private String name;
    private int volume;
    private int sugarContent;

    private boolean cream;

    private int temperature;

    private int cost;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public boolean isCream() {
        return cream;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getCost() {
        return cost;
    }

    public HotDrink(String name, int volume, int sugarContent,boolean cream, int temperature,int cost) {
        this.name=name;
        this.volume=volume;
        this.sugarContent=sugarContent;
        this.temperature=temperature;
        this.cost=cost;
        this.cream=cream;
    }

    public HotDrink(String name, int volume, int sugarContent, int temperature,int cost) {
        this.name=name;
        this.volume=volume;
        this.sugarContent=sugarContent;
        this.temperature=temperature;
        this.cost=cost;
    }

}
