package org.example;

//+++a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//+++b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//+++поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//+++. Для хранения фруктов внутри коробки можно использовать ArrayList;
//+++d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//+++вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//+++e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//+++подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//+++Можно сравнивать коробки с яблоками и апельсинами;
//+++f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//+++Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//+++Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//g. Не забываем про метод добавления фрукта в коробку.


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int minWeight = 100;
        int maxWeight = 200;
        Box<Apple> applesBox1 = new Box<>();
        Box<Orange> orangesBox1 = new Box<>();
        applesBox1.setMaxWeightBox(10000);
        orangesBox1.setMaxWeightBox(10000);
        Apple apple;
        Orange orange;
        while (true) {
            apple = new Apple("Granny Smith", new Random().nextInt(minWeight, maxWeight));
            if(applesBox1.getBoxWeight() + apple.getWeightFruit() > applesBox1.getMaxWeightBox()) break;
            applesBox1.addFruitToBox(apple);
        }
        while (true) {
            orange = new Orange("Navelin", new Random().nextInt(((int)(minWeight*1.5)), ((int)(maxWeight*1.5))));
            if(orangesBox1.getBoxWeight() + orange.getWeightFruit() > orangesBox1.getMaxWeightBox()) break;
            orangesBox1.addFruitToBox(orange);
        }

        System.out.println(applesBox1.getBoxWeight());
        System.out.println(applesBox1.getQuantity());
        System.out.println(orangesBox1.getBoxWeight());
        System.out.println(orangesBox1.getQuantity());
        System.out.println(applesBox1.compareWeightBoxes(orangesBox1));
        System.out.println(applesBox1.compareWeightBoxes(applesBox1));

        Box<Apple> applesBox2 = new Box<>();
        RelocateContent<Apple> rc1=new RelocateContent<>(applesBox1,applesBox2,5);
        rc1.exec();
        System.out.println(applesBox2.getBoxWeight());
        System.out.println(applesBox1.getQuantity());
        System.out.println(applesBox1.getBoxWeight());
        RelocateContent<Apple> rc2=new RelocateContent<>(applesBox1,applesBox2,59);
        rc2.exec();
        System.out.println(applesBox1.getBoxWeight());
        System.out.println(applesBox1.getQuantity());
        System.out.println(applesBox2.getQuantity());

    }
}