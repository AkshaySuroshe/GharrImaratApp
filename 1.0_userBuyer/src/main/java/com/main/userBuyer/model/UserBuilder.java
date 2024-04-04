package com.main.userBuyer.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.main.userBuyer.M.properties.PropertyCOMMERCIALRent;
import com.main.userBuyer.M.properties.PropertyPG;
import com.main.userBuyer.M.properties.PropertyPLOT;
import com.main.userBuyer.M.properties.PropertyRentAndBuy;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@IdClass(CompositeKeys.class)
@Data
public class UserBuilder {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID userBuilder1ID;
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID userBuilder2ID;
	private String userBuilderName;
	private String userBuilderEmail;
	private String userBuilderPassword; 
	private String userBuilderContact; 
	private String userBuilderAddress; 
	private String typeOfDeals;
	private String typeOfResidentialProperties;
	private String typeOfCommercialProperties;
	private String componyName;
	private String addressOfCompony;
	private String operatingSince;
	private String expertiseIn;
	private String descriptionOfBusiness;
	private String localTime;
	private String localDate;
	private String userType;
	
	@OneToMany(cascade = CascadeType.ALL)

	private List<PropertyRentAndBuy> propertyRentAndBuys = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)

	private List<PropertyPG> propertyPG= new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)

	private List<PropertyPLOT> propertyPLOT= new ArrayList<>();
//	
	@OneToMany(cascade =CascadeType.ALL)

	private List<PropertyCOMMERCIALRent> propertyCOMMERCIALRent= new ArrayList<>();
	
//	{
//	
//		  "userBuilderName": "John Doe",
//		  "userBuilderEmail": "johndoe@example.com",
//		  "userBuilderPassword": "randompassword123",
//		  "userBuilderContact": "+1234567890",
//		  "userBuilderAddress": "123 Main Street, City",
//		  "typeOfDeals": "Buy",
//		  "typeOfResidentialProperties": "Apartment",
//		  "typeOfCommercialProperties": "Office Space",
//		  "ComponyName": "ABC Realty",
//		  "addressOfCompony": "456 Business Blvd, City",
//		  "operatingSince": "2010-05-15",
//		  "expertiseIn": "Real Estate Investments",
//		  "descriptionOfBusiness": "We specialize in residential and commercial property sales and rentals.",
//		  "localTime": "",
//		  "localDate": "",
//		  "userType": "Builder",
//		 
//		}

}//
