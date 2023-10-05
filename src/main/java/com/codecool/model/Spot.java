package com.codecool.model;

import java.util.Objects;

public class Spot {
    private int idCounter = 0;
    private int id;
    private SpotType spotType;
    private boolean isFree;

    public Spot(SpotType spotType) {
        idCounter++;
        this.id = idCounter;
        this.spotType = spotType;
        this.isFree = true;
    }

    public void setOccupied() {
        isFree = false;
    }

    public void setFree() {
        isFree = true;
    }

    public double getPrice() {
        return spotType.getPrice();
    }

    public int getId() {
        return id;
    }

    public boolean isFree() {
        return isFree;
    }

    public boolean isBig() {
        return spotType == SpotType.BIG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spot spot = (Spot) o;
        return id == spot.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
