package com.codecool.service;

import com.codecool.model.Ticket;
import com.codecool.model.parkingspot.Spot;
import com.codecool.model.parkingspot.SpotType;
import com.codecool.model.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ParkingService {
    Set<Spot> spots;
    Set<Ticket> tickets;

    public ParkingService() {
        this.spots = new HashSet<>();
        this.tickets = new HashSet<>();
    }

    public Ticket reserve(Vehicle vehicle) {
        if (hasNoFreeSpot()) return null;

        Optional<Spot> optionalFoundSpot = getAvailibleSpot(vehicle);

        if (optionalFoundSpot.isEmpty()) {
            System.out.println("Sorry, no more parkingspot for your car size...");
            return null;
        }

        Spot spot = occupySpot(optionalFoundSpot);

        Ticket ticket = getTicket(vehicle, spot);

        return ticket;
    }

    private static Ticket getTicket(Vehicle vehicle, Spot spot) {
        Ticket ticket = new Ticket(LocalDateTime.now(), spot.getId(), spot.getPrice(), vehicle.getId());

        System.out.println("Here is your ticket: " + ticket.toString());
        return ticket;
    }

    private static Spot occupySpot(Optional<Spot> optionalFoundSpot) {
        Spot spot = optionalFoundSpot.get();
        spot.setOccupied();
        return spot;
    }

    public void addSpot(Spot spot) {
        spots.add(spot);
        System.out.println("Spot added..");
    }

    public void addSpots(Set<Spot> spots) {
        this.spots.addAll(spots);
        System.out.println("Spots added..");
    }

    private Optional<Spot> getAvailibleSpot(Vehicle vehicle) {
        List<SpotType> vehicleSpotTypes = vehicle.getSpotTypes();

        Optional<Spot> optionalFoundSpot = spots.stream()
                .filter(spot -> vehicleSpotTypes.contains(spot.getSpotType()))
                .filter(spot -> spot.isFree())
                .findFirst();
        return optionalFoundSpot;
    }

    private boolean hasNoFreeSpot() {
        if (spots.isEmpty()) {
            System.out.println("Sorry, no more parking spot left...");
            return true;
        }
        return false;
    }
}
