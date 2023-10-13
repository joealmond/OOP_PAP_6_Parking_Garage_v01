package com.codecool.model.vehicle;

import com.codecool.model.parkingspot.SpotType;

import java.util.List;

public class Car extends Vehicle {
    public Car() {
        super(List.of(SpotType.SMALL, SpotType.MEDIUM, SpotType.BIG));
    }
}
