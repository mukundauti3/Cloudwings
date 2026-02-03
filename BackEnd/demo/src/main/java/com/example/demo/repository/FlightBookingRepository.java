package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FlightBookingEntity;

@Repository
public interface FlightBookingRepository
        extends JpaRepository<FlightBookingEntity, Integer> {
}
