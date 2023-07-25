package org.example;

public class Buyer extends Human{
    private static int idBuyer;

    public Buyer(String fio){
        super(fio);
        idBuyer++;
        this.setFio(fio);
    }

    public Buyer(){

        this(null);
    }

    public int getIdBuyer() {

        return idBuyer;
    }
}
