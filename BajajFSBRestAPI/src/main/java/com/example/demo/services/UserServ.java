package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;

@Service
public class UserServ {
	@Autowired
	UserRepo uRepo;
	
	public User getById(String id) {
		return uRepo.findById(id).get();
	}

}
