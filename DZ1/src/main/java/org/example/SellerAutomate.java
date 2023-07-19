package org.example;

import org.jetbrains.annotations.NotNull;

public class SellerAutomate implements Sellable{

    public void sell(@NotNull Coffee coffee) {
        System.out.printf("Продали %d мл. %s с содержанием сахара %d ед. температурой %d градусов.\n"+"%s\n" +
                        "Стоимость составила %d рублей.\n",coffee.getVolume(),coffee.getName(),
                coffee.getSugarContent(),coffee.getTemperature(),
                coffee.isCream()?"Были добавлены сливки.":"Без сливок.",coffee.getCost());
    }

    public void sell(@NotNull Cocoa cocoa) {
        System.out.printf("Продали %d мл. %s с содержанием сахара %d ед. температурой %d градусов.\n"+"%s\n" +
                        "Стоимость составила %d рублей.\n",cocoa.getVolume(),cocoa.getName(),
                cocoa.getSugarContent(),cocoa.getTemperature(),
                cocoa.isMilk()?"Было добавлено молоко.":"Без молока.",cocoa.getCost());
    }

    public void sell(@NotNull Tea tea) {
        System.out.printf("Продали %d мл. %s с содержанием сахара %d ед. температурой %d градусов.\n"+
                        "Стоимость составила %d рублей.\n",tea.getVolume(),tea.getName(),
                tea.getSugarContent(),tea.getTemperature(), tea.getCost());
    }

}
