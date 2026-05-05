package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(double price, boolean occupied, boolean dirty, int numberOfBeds) {
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }

    @Override
    public String toString() {
        return "numberOfBeds = " + numberOfBeds +
                ", price = " + price +
                ", available : " + isAvailable();
    }
}
