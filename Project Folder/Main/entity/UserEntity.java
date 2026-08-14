package com.example.razorpay.entity;

import lombok.Data;

@Data
public class User {
	
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}

