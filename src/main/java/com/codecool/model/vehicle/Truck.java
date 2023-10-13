package com.codecool.model.vehicle;

import com.codecool.model.parkingspot.SpotType;

import java.util.List;

public class Truck extends Vehicle {
    public Truck() {
        super(List.of(SpotType.BIG));
    }
}
