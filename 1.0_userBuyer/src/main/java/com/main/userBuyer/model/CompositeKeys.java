package com.main.userBuyer.model;

import java.util.UUID;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CompositeKeys {
	private UUID userBuilder1ID;
	private UUID userBuilder2ID;
}
