package com.week1Group;

public class Vendor {
    String name;
    Products[] items = new Products[5];

    public Vendor(String name, Products[] items){
        this.name = name;
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Products[] getItems() {
        return items;
    }

    public void setItems(Products[] items) {
        this.items = items;
    }
}
