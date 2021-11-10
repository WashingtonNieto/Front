package com.Front.Front.Controller;

import com.Front.Front.Entity.Reservation;
import com.Front.Front.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){

        return reservationService.getAll();
    }

}
