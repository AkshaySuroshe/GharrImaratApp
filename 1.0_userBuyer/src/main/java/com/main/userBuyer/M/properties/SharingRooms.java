package com.main.userBuyer.M.properties;

import java.util.List;
import java.util.UUID;

import com.main.userBuyer.media.PropertyImages;
import com.main.userBuyer.media.PropertyReview;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class SharingRooms {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID roomPGID;
	private String roomNo; 	
	private String sharing;
	private int rent; 
	private String foodAvailability;  
	private String Amenities;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyImages> propertyImages;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyReview> propertyReviewes;
	
}//
