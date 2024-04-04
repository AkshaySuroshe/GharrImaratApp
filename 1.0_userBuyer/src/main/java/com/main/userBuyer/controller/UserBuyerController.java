package com.main.userBuyer.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.main.userBuyer.model.UserBuilder;
import com.main.userBuyer.service.Service;

@RestController
public class UserBuyerController {

	@Autowired
	Service service;
	
	@PostMapping("/users/builder")
		public ResponseEntity<UserBuilder> saveData(@RequestBody UserBuilder userBuilder)
		{
		UserBuilder userBuilder2	=service.saveData(userBuilder);
			return new ResponseEntity<UserBuilder>(userBuilder2, HttpStatus.OK);
		}
	@GetMapping("users/builder/{userBuilder1ID}/{userBuilder2ID}")
	public ResponseEntity<UserBuilder> getData(@PathVariable UUID userBuilder1ID,@PathVariable UUID userBuilder2ID)
	{
		UserBuilder userBuilder = service.getAllData(userBuilder1ID,userBuilder2ID);
		System.out.println(userBuilder);
		return new ResponseEntity<UserBuilder>(userBuilder,HttpStatus.OK);
	}
	
}//
