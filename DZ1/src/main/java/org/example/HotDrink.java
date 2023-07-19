package org.example;

public class HotDrink{
    private String name;
    private int volume;
    private int sugarContent;

    private boolean cream;

    private boolean milk;

    private int temperature;

    private int cost;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isMilk() { return milk; }

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

    public HotDrink(String name, int volume, boolean milk, int sugarContent,boolean cream, int temperature,int cost) {
        this.name=name;
        this.volume=volume;
        this.temperature=temperature;

        this.sugarContent=sugarContent;
        this.cream=cream;
        this.milk=milk;

        this.cost=cost;
    }

    public HotDrink(String name, int volume, int sugarContent, int temperature,int cost) {
        this(name,volume,false,sugarContent,false,temperature,cost);
    }

    public HotDrink(String name, int volume, int sugarContent, boolean cream, int temperature,int cost) {
        this(name,volume,false,sugarContent,cream,temperature,cost);
    }

    public HotDrink(String name, int volume,boolean milk, int sugarContent, int temperature,int cost) {
        this(name,volume,milk,sugarContent,false,temperature,cost);
    }
}
