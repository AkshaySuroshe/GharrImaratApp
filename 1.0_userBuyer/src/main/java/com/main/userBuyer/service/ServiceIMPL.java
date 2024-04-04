package com.main.userBuyer.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.userBuyer.Repo.UserBuilderRepo;
import com.main.userBuyer.model.UserBuilder;

@Service
public class ServiceIMPL implements com.main.userBuyer.service.Service{

	@Autowired
	UserBuilderRepo userBuilderRepo;
	
	@Override
	public UserBuilder saveData(UserBuilder userBuilder) {
		LocalTime localTime1 = LocalTime.now();
		String localTime=localTime1.toString();
		userBuilder.setLocalTime( localTime);
		LocalDate localDate1 = LocalDate.now();
		String localDate = localDate1.toString();
		userBuilder.setLocalDate(localDate);
		return userBuilderRepo.save(userBuilder);
	}

	@Override
	public UserBuilder getAllData(UUID userBuilder1ID,UUID userBuilder2ID) {
		UserBuilder userBuilder = userBuilderRepo.findByUser(userBuilder1ID,userBuilder2ID);
		return userBuilder;
	}

}//
