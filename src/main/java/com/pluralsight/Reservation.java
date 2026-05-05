package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(){}

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice(){
        double price = 0;
        if (getRoomType().equalsIgnoreCase("king")){
            price = 139;
        } else if (getRoomType().equalsIgnoreCase("double")) {
            price = 124;
        }

        if (isWeekend()){
            price *= 0.1;

        }
        return price;
    }

    public double getReservationTotal(){
        return getPrice() * getNumberOfNights();
    }

    @Override
    public String toString() {
        return "roomType = '" + roomType + '\'' +
                ", numberOfNights = " + numberOfNights +
                ", weekend = " + weekend +
                ", reservation total = " + getReservationTotal();
    }
}
