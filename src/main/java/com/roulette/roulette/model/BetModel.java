package com.roulette.roulette.model;

public class BetModel {
	private int amount;
	private double won;
	private int userId;
	public BetModel(int amount, int userId) {
		this.amount = amount;
		this.setUserId(userId);
		this.won = 0;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getWon() {
		return won;
	}
	public void setWon(double d) {
		this.won = d;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
