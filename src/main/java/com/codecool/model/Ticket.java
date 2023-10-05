package com.codecool.model;

import java.time.LocalDateTime;
public record Ticket (LocalDateTime reservationDate, int spotId, double spotPrice, int vehicleId) {
}

//public class Ticket {
//    private LocalDateTime reservationDate;
//    private int spotId;
//    private double spotPrice;
//    private int vehicleId;
//
//    public Ticket(LocalDateTime reservationDate, int spotId, double spotPrice, int vehicleId) {
//        this.reservationDate = reservationDate;
//        this.spotId = spotId;
//        this.spotPrice = spotPrice;
//        this.vehicleId = vehicleId;
//    }
//}
