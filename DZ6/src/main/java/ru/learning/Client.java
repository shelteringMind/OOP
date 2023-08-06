package ru.learning;

public class Client {
    private static int countId;
    private int id;
    private String name;

    public Client(){
        this.id = ++countId;
    }

    public Client(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
      return id;
    }

}
