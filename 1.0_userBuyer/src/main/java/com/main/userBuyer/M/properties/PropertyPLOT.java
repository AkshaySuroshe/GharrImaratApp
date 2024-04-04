package com.main.userBuyer.M.properties;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class PropertyPLOT {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID propertyPlotID; 
	private String propertyPlotName; 
	private String propertyAddress;	
	private String aboutPLOT; 
	private int ratePerSqFt; 
	private int plotPrice;
	private String plotArea;
	private String dimension;
	private String anyConstructionDone; 
    private String amenities; 
	private String bookingAmmount;
	private String facing; 
	private String floorsAllowed; 
	private String landMarks; 
	private String additionalFeatures;
	private String widthOfRoadFacing;
	private String localTime;
	private String localDate;
		
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyImages> propertyImages;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyReview> propertyReviews;
}//
