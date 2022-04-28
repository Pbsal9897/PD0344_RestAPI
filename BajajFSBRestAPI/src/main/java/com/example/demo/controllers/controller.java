package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserServ;

@RestController
public class controller {
	@Autowired
	UserServ uServ;
	
	@PostMapping("/bfhl")
	public User getUser(@RequestBody List<String> data) {
		
		List<String> num=new ArrayList<>();
		List<String> ab=new ArrayList<>();
		for(String d: data) {
			int a=Integer.parseInt(d);
			if((char)a>='A' && (char)a<='Z' || (char)a>='a' && (char)a<='z') {
				ab.add((char)a+"");
			}
			else {
				num.add(a+"");
			}
		}
		
		User u= new User(true,"john_doe_17091999","ABCD123",num,ab);
		return u;
		
	}

}
