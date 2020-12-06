package com.upgrade.challenge.reservations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation {

    @Id
    private String id;
    private String arrivalDate;
    private String departureDate;
    private String name;
    private String email;

    public Reservation() {

    }
    public Reservation(String id, String arrivalDate, String departureDate, String name, String email) {
        super();
        this.id = id;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.name = name;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }


}
