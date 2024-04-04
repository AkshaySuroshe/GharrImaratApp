package com.main.userBuyer.media;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PropertyReview {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID reviewID;
	private UUID userId;
	private int rating; 
	private String comments; 
	private String localTime;
	private String localDate;
}//
