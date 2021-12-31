package com.company;

public class RegularTicket extends Ticket{

    String allowedSpecialServices[] ={"food", "water", "snacks","Book"};
    String availedServices;

    public String getAvailedServices() {
        return availedServices;
    }

    public void setAvailedServices(String availedServices) {
        this.availedServices = availedServices;
    }


    public RegularTicket(int pnrNumber, int seatNumber, float price, String availedServices) {
        super(pnrNumber, seatNumber, price);
        this.availedServices = availedServices;
    }

}
