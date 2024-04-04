package com.main.userBuyer.M.properties;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class PropertyPG {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
private UUID propertyPGID; 
private	String propertyPGName; 	
private	String description; 
private int depositeAmmount; 
private	String noticePeriod; 
private String foodAvailability; 
private String acRoomsAvailability; 
private	String parking; 
private	String powerBackup; 
private	String availableFor;
private	String totalNoOfBeds;
private	String localTime;
private	String localDate;
	
@OneToMany(cascade = CascadeType.ALL)
private List<SharingRooms> sharingRooms;
}//
