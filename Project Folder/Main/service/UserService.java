package com.example.razorpay.service;

//import java.time.LocalDateTime;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class UserService {

	@Value("${razorpay.key.id}")
	private String id;
	
	@Value("${razorpay.key.secret}")
	private String secret;
	
	public Object payment(int amount) throws RazorpayException {
		
		RazorpayClient razorpayClient = new RazorpayClient(id, secret);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("amount", amount*100);
		jsonObject.put("currency", "INR");
		jsonObject.put("receipt", "rcpt_66565626645496");
//		jsonObject.put("time", LocalDateTime.now());
		
		Order order = razorpayClient.orders.create(jsonObject);
		return order.toString();
	}
	
	
}

