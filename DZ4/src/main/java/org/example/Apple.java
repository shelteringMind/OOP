package org.example;
/**
 * Яюлоки
 */
public class Apple<T extends Fruit> extends Fruit {
    private static final String NAME = "Яблоко";
    public Apple(String sort,int weight){

        super(Apple.NAME,sort, weight);
    }
    public Apple(){

    }
}
