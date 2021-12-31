package com.company;

import java.util.ArrayList;
import java.util.List;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String selectedLocation;

    public String getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(String selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    public void displaySelectedLocation(){
          System.out.println("Selected Location are "+ getSelectedLocation());
    }

    public TouristTicket(int pnrNumber, int seatNumber, float price,String hotelAddress, String selectedLocation) {
        super(pnrNumber, seatNumber, price);
        this.hotelAddress = hotelAddress;
        this.selectedLocation = selectedLocation;
    }
}
