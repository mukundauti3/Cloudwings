package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PassengerEntity;
import com.example.demo.repository.PassengerRepository;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    // Add / Update passenger
    public PassengerEntity savePassenger(PassengerEntity passenger) {
        return passengerRepository.save(passenger);
    }

    // Get passenger by Aadhar number
    public PassengerEntity getPassengerByAdhar(String adharNo) {
        Optional<PassengerEntity> passenger =
                passengerRepository.findById(adharNo);
        return passenger.orElse(null);
    }

    // Get all passengers
    public List<PassengerEntity> getAllPassengers() {
        return passengerRepository.findAll();
    }

    // Delete passenger
    public void deletePassenger(String adharNo) {
        passengerRepository.deleteById(adharNo);
    }
}
