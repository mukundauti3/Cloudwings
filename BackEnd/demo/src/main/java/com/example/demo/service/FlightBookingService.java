package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FlightBookingEntity;
import com.example.demo.repository.FlightBookingRepository;

@Service
public class FlightBookingService {

    @Autowired
    private FlightBookingRepository flightBookingRepository;

    // Create / Update Booking
    public FlightBookingEntity saveBooking(FlightBookingEntity booking) {
        return flightBookingRepository.save(booking);
    }

    // Get booking by ID
    public FlightBookingEntity getBookingById(int bookingId) {
        Optional<FlightBookingEntity> booking =
                flightBookingRepository.findById(bookingId);
        return booking.orElse(null);
    }

    // Get all bookings
    public List<FlightBookingEntity> getAllBookings() {
        return flightBookingRepository.findAll();
    }

    // Delete booking
    public void deleteBooking(int bookingId) {
        flightBookingRepository.deleteById(bookingId);
    }
}
