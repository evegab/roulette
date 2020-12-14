package com.roulette.roulette.model;

public class BetModel {
	private int amount;
	private int won;
	public BetModel(int amount) {
		this.amount = amount;
		this.won = 0;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	
}
