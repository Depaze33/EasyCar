package fr.easycar.rental.easycar;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public Customer(String firstName, String lastName, String address, String city, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public double totalMoneySpent() {
        double moneySpent = 0.0;

        for (Reservation reservation : reservations) {
            moneySpent += reservation.totalPrice();
        }
        return moneySpent;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        if (this.reservations.size() >= 1) {
            this.reservations.remove((reservation));

        }
    }
}
