package com.codecool.service;

import com.codecool.model.Spot;
import com.codecool.model.SpotType;
import com.codecool.model.Ticket;
import com.codecool.model.Vehicle;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ParkingService {

    Set<Spot> spots;

    Set<Ticket> tickets;

    public ParkingService() {
        this.spots = new HashSet<>();
        this.tickets = new HashSet<>();
    }

    public void addSpot(Spot spot) {
        spots.add(spot);
        System.out.println("Spot added..");
    }
    public void addAllSpot(Set<Spot> spots) {
        this.spots.addAll(spots);
        System.out.println("Spots added..");
    }

    public Ticket reserve(Vehicle vehicle) {
        Set<Spot> freeSpots;
        if (vehicle.isTruck()) {
            freeSpots = spots.stream()
                    .filter(spot -> spot.isFree())
                    .filter(spot -> spot.isBig())
                    .collect(Collectors.toSet());
            // find first a collect helyett
        } else {
            freeSpots = spots.stream()
                    .filter(spot -> spot.isFree())
                    .collect(Collectors.toSet());
        }

        if (freeSpots.isEmpty()) {
            System.out.println("Sorry, no places avaible...");
            // TODO: is ok to return this? - No. return null!
            return new Ticket(LocalDateTime.now(),0,0,0);
        }

        // TODO: take the first or random spot set it to occupied

        int spotId = vehicle.getId();
        int vehicleId = vehicle.getId();
        double price = SpotType.SMALL.getPrice();
        if (vehicle.isTruck()) {
            price = SpotType.BIG.getPrice();
        }
        // TODO: add ticket to list
        System.out.println("Take your ticket...");
        return new Ticket(LocalDateTime.now(),1,9.99,1);
    }
}

// Regular cars can park in large spots but only if there are no small spots left in the garage.
// Trucks can only park in large spots.
// Two vehicles cannot park in the same parking spot.
// One vehicle cannot park in multiple spots at the same time.
