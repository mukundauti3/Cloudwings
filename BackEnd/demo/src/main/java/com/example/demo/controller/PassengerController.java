package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.PassengerEntity;
import com.example.demo.service.PassengerService;

@RestController
@RequestMapping("/api/passengers")
@CrossOrigin(origins = "*")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    // Add passenger
    @PostMapping
    public PassengerEntity addPassenger(
            @RequestBody PassengerEntity passenger) {
        return passengerService.savePassenger(passenger);
    }

    // Get passenger by Aadhar number
    @GetMapping("/{adharNo}")
    public PassengerEntity getPassengerByAdhar(
            @PathVariable String adharNo) {
        return passengerService.getPassengerByAdhar(adharNo);
    }

    // Get all passengers
    @GetMapping
    public List<PassengerEntity> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    // Delete passenger
    @DeleteMapping("/{adharNo}")
    public String deletePassenger(@PathVariable String adharNo) {
        passengerService.deletePassenger(adharNo);
        return "Passenger deleted successfully";
    }
}
