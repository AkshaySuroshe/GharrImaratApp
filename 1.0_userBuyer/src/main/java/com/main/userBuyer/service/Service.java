package com.main.userBuyer.service;

import java.util.UUID;

import com.main.userBuyer.model.UserBuilder;

public interface Service {

	UserBuilder saveData(UserBuilder userBuilder);

	UserBuilder getAllData(UUID userBuilder1ID, UUID userBuilder2ID);

}
