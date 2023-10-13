package com.codecool.model.vehicle;

import com.codecool.model.parkingspot.SpotType;

import java.util.List;

public class Pickup extends Vehicle {
    public Pickup() {
        super(List.of(SpotType.MEDIUM, SpotType.BIG));
    }
}
