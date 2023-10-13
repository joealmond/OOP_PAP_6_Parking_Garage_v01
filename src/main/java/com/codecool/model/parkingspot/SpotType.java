package com.codecool.model.parkingspot;

public enum SpotType {
    SMALL(9.99),
    MEDIUM(14.99),
    BIG(19.99);

    private final double price;

    SpotType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
