package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Flight flight1 = new Flight(1, "Air India", "Bangalore", "Mumbai",  200,
                100);

        Flight flight2 = new Flight(2, "Air Asia", "Bangalore", "Mumbai",  150,
                50);

        Flight flight3 = new Flight(3, "Spice Jet", "Bangalore", "Mumbai",  125, 75);


        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        Passenger passenger1 = new Passenger("Ajay", 1234, "ajay@gmail.com", "4th Cross", "Bangalore", "Karnataka");

        Passenger passenger2 = new Passenger("Vijay", 5678, "vijay@gmail.com", "7th Cross", "Mysore", "Karnataka");

        List<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);


        Ticket t1 = new TouristTicket(101, 35, 2000, "Hydrabad", "location1");
        Ticket t2 = new RegularTicket(201, 36, 1000, "food");


        System.out.println("PNR number for Tourist Ticket is : " + t1.getPnrNumber());

        System.out.println("PNR number for Regular Ticket is : " + t2.getPnrNumber());



    }
}


