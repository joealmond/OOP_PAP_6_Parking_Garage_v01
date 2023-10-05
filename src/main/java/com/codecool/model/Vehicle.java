package com.codecool.model;

public class Vehicle {
    private int idCounter = 0;
    private int id;
    private boolean isTruck;

    public Vehicle(boolean isTruck) {
        idCounter++;
        this.id = idCounter;
        this.isTruck = isTruck;
    }

    public boolean isTruck() {
        return isTruck;
    }

    public int getId() {
        return id;
    }
}
