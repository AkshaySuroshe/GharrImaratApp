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
public class PropertyCOMMERCIALRent {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID propertyCommID; 
	private String propertyCommName; 
	private String propertyAddres;
	private String propertyType;
	private String commercialComplexName; 
	private String superArea;
	private String carpetArea;
	private String floors;
	private String dimension;
	private String unitOnFloor; 
    private    	String washroom; 
	private String overLooking;
	private String facing; 
	private String availableLifts; 
	private int rentalValue; 
	private int securityDeposits;
	private String facilities;
	private String lockinPeriod;
	private String waterAvailability;
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyImages> propertyImages;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyReview> propertyReviews;
}
