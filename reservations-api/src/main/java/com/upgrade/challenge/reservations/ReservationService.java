package com.upgrade.challenge.reservations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    private List<Reservation> reservations=new ArrayList<>(Arrays.asList(new Reservation("1","06-12-2020","08-12-2020","Gaurav Tripathi","gauravtripathi001@gmail.com")));
    public List<Reservation> getAllReservations(){
        List<Reservation> reservations=new ArrayList<>();
        reservationRepository.findAll().
                forEach(reservations::add);
        return reservations;
    }
    public Reservation getReservation(String id){
        List<Reservation> reservations=new ArrayList<>();
        return reservationRepository.findById(id).get();

    }

    public void addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public void updateReservation(String id, Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public void deleteReservation(String id) {
        reservationRepository.delete(reservationRepository.findById(id).get());
    }
}
