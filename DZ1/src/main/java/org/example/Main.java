package org.example;

//Создать наследника реализованного класса ГорячийНапиток
//с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
//и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//выдающий продукт соответствующий имени, объёму и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
//и воспроизвести логику, заложенную в программе
//Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

public class Main {
    public static void main(String[] args) {

        SellerAutomate sellAutomate = new SellerAutomate();

        Coffee coffee= new Coffee("BlackCoffee",200,0,false,90,100);
        sellAutomate.sell(coffee);

        Coffee coffeeCream= new Coffee("BlackCoffeeCream",200,2,true,80,150);
        sellAutomate.sell(coffeeCream);

        Tea tea= new Tea("GreenTea",100,3,60,70);
        sellAutomate.sell(tea);

        Cocoa cocoa= new Cocoa("Cocoa",150,3,false,70,120);
        sellAutomate.sell(cocoa);
    }
}