package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "flight_booking")
@Data
public class FlightBookingEntity {

    @Id
    @Column(name = "booking_id")
    private int bookingId;

    @Column(name = "user_id")
    private Integer userId;   // Integer because DB allows NULL

    @Column(name = "flight_id")
    private Integer flightId; // Integer because DB allows NULL

    @Column(name = "seat_no", length = 30)
    private String seatNo;

    @Column(name = "booking_date")
    private LocalDate bookingDate;

    @Column(name = "status", length = 30)
    private String status;
}
