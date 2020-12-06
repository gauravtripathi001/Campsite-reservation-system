package com.upgrade.challenge.reservations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @RequestMapping("/reservations")
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }
    @RequestMapping("/reservations/{id}")
    public Reservation getReservation(@PathVariable String id){
        return reservationService.getReservation(id);
    }
    @RequestMapping(method = RequestMethod.POST,value="/reservations")
    public void addReservation(@RequestBody Reservation reservation){
        reservationService.addReservation(reservation);
    }
    @RequestMapping(method = RequestMethod.PUT,value="/reservations/{id}")
    public void addReservation(@RequestBody Reservation reservation,@PathVariable String id){
        reservationService.updateReservation(id,reservation);
    }
    @RequestMapping(method = RequestMethod.DELETE,value="/reservations/{id}")
    public void deleteReservation(@PathVariable String id){
        reservationService.deleteReservation(id);
    }
}
