package com.example.razorpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.razorpay.entity.User;
import com.example.razorpay.service.UserService;
import com.razorpay.RazorpayException;

@RestController
@RequestMapping("/payments")
public class UserController{

	@Autowired
	UserService userService;
	
	@PostMapping
	public Object upay(@RequestBody User user) throws RazorpayException {
		
		return userService.payment(user.getAmount());
	}
}

