package com.codecool.model;

import java.time.LocalDateTime;

public record Ticket(LocalDateTime reservationDate, int spotId, double spotPrice, int vehicleId) {
}
