package org.example;
/**
 * Апельсины
 */
public class Orange<T extends Fruit> extends Fruit {
    private static final String NAME = "Апельсин";
    public Orange(String sort, int weight) {

        super(Orange.NAME,sort, weight);
    }

    public Orange() {

    }
}
