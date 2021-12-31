package com.company;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private Contact contact = new Contact();
    private Address address = new Address();
    private static int idCounter;
    private int id;

    public Passenger(String name, long phoneNumber, String emailId, String street, String city, String state) {
        this.contact.name = name;
        this.contact.phoneNumber = phoneNumber;
        this.contact.emailId = emailId;
        this.address.street = street;
        this.address.city = city;
        this.address.state = state;

        this.id = idCounter;
        idCounter++;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    private static class Contact {
        private String name;
        private long phoneNumber;
        private String emailId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        @Override
        public String toString() {
            return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + "]";
        }

    }

    private static class Address {
        private String street;
        private String city;
        private String state;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }


    }


   public static String getPassengerCount(){
        return "Number of Passenger is : " + idCounter;
   }

}
