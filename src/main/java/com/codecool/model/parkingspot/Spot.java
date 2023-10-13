package com.codecool.model.parkingspot;

import java.util.Objects;

public class Spot {
    private static int idCounter = 0;
    private int id;
    private final SpotType spotType;

    private boolean isFree;

    public Spot(SpotType spotType) {
        this.id = idCounter++;
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

    public SpotType getSpotType() {
        return spotType;
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
