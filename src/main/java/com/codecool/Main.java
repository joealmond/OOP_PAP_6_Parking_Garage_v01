package com.codecool;

import com.codecool.model.parkingspot.Spot;
import com.codecool.model.vehicle.Car;
import com.codecool.model.vehicle.Pickup;
import com.codecool.model.vehicle.Truck;
import com.codecool.service.ParkingService;

import java.util.Set;

import static com.codecool.model.parkingspot.SpotType.*;

public class Main {
    public static void main(String[] args) {
        Spot spot1 = new Spot(BIG);
        Spot spot2 = new Spot(BIG);
        Spot spot3 = new Spot(SMALL);
        Spot spot4 = new Spot(SMALL);
        Spot spot5 = new Spot(SMALL);
        Spot spot6 = new Spot(MEDIUM);

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Pickup pickup1 = new Pickup();
        Pickup pickup2 = new Pickup();

        ParkingService parkingGarage = new ParkingService();

        parkingGarage.addSpots(Set.of(spot1, spot2, spot3, spot4, spot5, spot6));

        parkingGarage.reserve(car1);
        parkingGarage.reserve(car2);
        parkingGarage.reserve(car3);
        parkingGarage.reserve(truck1);
        parkingGarage.reserve(pickup1);
        parkingGarage.reserve(pickup2);
        parkingGarage.reserve(truck2);
        parkingGarage.reserve(car4);
        parkingGarage.reserve(car5);
    }
}