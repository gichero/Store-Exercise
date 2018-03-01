package com.week1Group;

public class Store {

    Vendor [] sellers = new Vendor[3];

    public Store(Vendor[] sellers){
        this.sellers = sellers;
    }


    public Vendor[] getSellers() {
        return sellers;
    }

    public void setSellers(Vendor[] sellers) {
        this.sellers = sellers;
    }
}
