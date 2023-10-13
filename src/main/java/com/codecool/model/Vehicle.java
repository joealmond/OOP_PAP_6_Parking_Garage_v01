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
    // jó lenne ha ebből le lehetne származni (car->Vehicle)
    // így bővíthetőbb lenne a kód

    // az autónak kell tunia magáról hogy hová kell parkolni
    // OOP táblában a két linket megnézni

    public boolean isTruck() {
        return isTruck;
    }

    public int getId() {
        return id;
    }
}
