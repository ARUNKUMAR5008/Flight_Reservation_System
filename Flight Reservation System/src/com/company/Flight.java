package com.company;

import java.time.LocalDateTime;

public class Flight{
    private int flightNumber;
    private String flightName;
    private int capacity;
    private int noOfSeatsBooked;
    private String departureLocation;
    private String destinationLocation;

    public Flight(int flightNumber, String flightName, String departureLocation, String destinationLocation,
                   int capacity, int noOfSeatsBooked) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.capacity = capacity;
        this.noOfSeatsBooked= noOfSeatsBooked;
    }


    public String getFlightName() {
        return flightName;
    }

    public void setAirlineName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNoOfSeatsBooked(int noOfSeatsBooked) {
        this.noOfSeatsBooked = noOfSeatsBooked;
    }

    public int getNoOfSeatsBooked() {
        return noOfSeatsBooked;
    }

    public int getCurrentCapacity() {
        return capacity - noOfSeatsBooked;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }
}