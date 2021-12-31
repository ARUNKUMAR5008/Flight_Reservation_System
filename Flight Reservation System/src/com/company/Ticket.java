package com.company;

public abstract class Ticket {
    private int pnrNumber;
    private int seatNumber;
    private float price;
    private static final String departure = " Bangalore ";
    private String destination;
    private boolean isCancelled;
    public Flight flight;
    public Passenger passenger;
    String[] locations={"Mumbai", "Delhi", "Kolkata", "Chennai", "Goa", "Pune", "Mysore"};

    public int getPnrNumber() {
        return pnrNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public Ticket(int pnrNumber, int seatNumber, float price) {
        this.pnrNumber = pnrNumber;
        this.seatNumber = seatNumber;
        this.price = price;
    }


    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }

    public static void addOrRemoveLocation(){

    }
}
