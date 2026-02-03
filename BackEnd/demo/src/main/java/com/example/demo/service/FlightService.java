package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FlightEntity;
import com.example.demo.repository.FlightRepository;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    // Add / Update flight
    public FlightEntity saveFlight(FlightEntity flight) {
        return flightRepository.save(flight);
    }

    // Get flight by ID
    public FlightEntity getFlightById(int flightId) {
        Optional<FlightEntity> flight = flightRepository.findById(flightId);
        return flight.orElse(null);
    }

    // Get all flights
    public List<FlightEntity> getAllFlights() {
        return flightRepository.findAll();
    }

    // Delete flight
    public void deleteFlight(int flightId) {
        flightRepository.deleteById(flightId);
    }
}
