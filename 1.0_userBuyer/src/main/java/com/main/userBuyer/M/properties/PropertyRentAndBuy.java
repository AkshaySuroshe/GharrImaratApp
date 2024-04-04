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
public class PropertyRentAndBuy {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID propertyRentAndBuyId;
	private String propertyRBName; 	
	private String description;
	private String propertyLocality;
	private int price; 
	private String location; 
	private String flatBHK; 
	private String balcony;
	private String parking;
	private String propertyTYPE; 
	private String carpetArea; 
	private String facing;
	private String constructionPhase; 
	private String furnishing; 
	private String societyName; 
	private String checkLonEligibilty; 
	private String imagesOFProperties;
	private int numberOfBathroom;
	private String amenities;
	private String localTime;
	private String localDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyImages> propertyImages;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyReview> propertyReviews;
}//
