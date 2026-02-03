package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="flights")
public class FlightEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="flight_id")
	private int flight_id;
	
	@Column(name="airline")
	private String airline;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="depature_time")
	private String depature_time;
	
	@Column(name="arrival_time")
	private String arrival_time;
	
	@Column(name="price")
	private double price;
	
	@Column(name="no_of_seats")
	private int noOfSeats;
	
}
