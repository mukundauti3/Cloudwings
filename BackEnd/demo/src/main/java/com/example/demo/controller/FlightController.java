package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.FlightEntity;
import com.example.demo.service.FlightService;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "*")
public class FlightController {

    @Autowired
    private FlightService flightService;

    // Add flight
    @PostMapping
    public FlightEntity addFlight(@RequestBody FlightEntity flight) {
        return flightService.saveFlight(flight);
    }

    // Get flight by ID
    @GetMapping("/{id}")
    public FlightEntity getFlightById(@PathVariable int id) {
        return flightService.getFlightById(id);
    }

    // Get all flights
    @GetMapping
    public List<FlightEntity> getAllFlights() {
        return flightService.getAllFlights();
    }

    // Delete flight
    @DeleteMapping("/{id}")
    public String deleteFlight(@PathVariable int id) {
        flightService.deleteFlight(id);
        return "Flight deleted successfully";
    }
}
