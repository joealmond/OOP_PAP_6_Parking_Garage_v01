package com.codecool;

import com.codecool.model.Spot;
import com.codecool.service.ParkingService;

import java.util.Set;

import static com.codecool.model.SpotType.*;

public class Main {
    public static void main(String[] args) {
        Spot spot1 = new Spot(BIG);
        Spot spot2 = new Spot(BIG);
        Spot spot3 = new Spot(SMALL);
        Spot spot4 = new Spot(SMALL);
        Spot spot5 = new Spot(SMALL);

        ParkingService parkingGarage = new ParkingService();

        parkingGarage.addAllSpot(Set.of(spot1,spot2,spot3,spot4,spot5));

        System.out.println("Hello world!");
    }
}