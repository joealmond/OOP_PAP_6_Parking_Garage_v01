package com.codecool.service;

import com.codecool.model.parkingspot.Spot;
import com.codecool.model.parkingspot.SpotType;
import com.codecool.model.Ticket;
import com.codecool.model.vehicle.Car;

import static org.junit.jupiter.api.Assertions.*;

class ParkingServiceTest {

    @org.junit.jupiter.api.Test
    void reserve_shouldReturnTicketWithVehicleId_whenSpotAvailable() {
        // arrange

        Car car1 = new Car();

        Spot spot1 = new Spot(SpotType.SMALL);

        ParkingService garage = new ParkingService();

        garage.addSpot(spot1);

        // act

        Ticket ticket1 = garage.reserve(car1);


        // assert

        assertEquals(0,ticket1.vehicleId());

    }

    @org.junit.jupiter.api.Test
    void reserve_shouldReturnNull_whenNoSpotAvailable() {
        // Arrange
        Car car1 = new Car();
        Spot spot1 = new Spot(SpotType.SMALL);
        spot1.setOccupied();

        ParkingService garage = new ParkingService();

        garage.addSpot(spot1);

        // Act
        Ticket ticket = garage.reserve(car1);

        // Assert
        assertEquals(null, ticket);
    }
}