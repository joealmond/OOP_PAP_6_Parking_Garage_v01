package com.codecool.model.vehicle;

import com.codecool.model.parkingspot.SpotType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehicle {
    private static int idCounter = 0;
    private final int id;
    private final List<SpotType> spotTypes;

    public Vehicle(List<SpotType> spotTypes) {
        this.spotTypes = spotTypes;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public List<SpotType> getSpotTypes() {
        return new ArrayList<>(spotTypes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
