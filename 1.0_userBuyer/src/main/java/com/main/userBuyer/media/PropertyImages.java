package com.main.userBuyer.media;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PropertyImages {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID imageId;
	private byte[] imageFile;
}//
