package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.FlightBookingEntity;
import com.example.demo.service.FlightBookingService;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class FlightBookingController {

    @Autowired
    private FlightBookingService flightBookingService;

    // Create booking
    @PostMapping
    public FlightBookingEntity createBooking(
            @RequestBody FlightBookingEntity booking) {
        return flightBookingService.saveBooking(booking);
    }

    // Get booking by ID
    @GetMapping("/{id}")
    public FlightBookingEntity getBookingById(@PathVariable int id) {
        return flightBookingService.getBookingById(id);
    }

    // Get all bookings
    @GetMapping
    public List<FlightBookingEntity> getAllBookings() {
        return flightBookingService.getAllBookings();
    }

    // Delete booking
    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable int id) {
        flightBookingService.deleteBooking(id);
        return "Booking deleted successfully";
    }
}
