package com.roulette.roulette.model;

public class BetNumberModel extends BetModel {
	private int numberSelected;
	public BetNumberModel(int amount, int numberSelected, int userId) {
		super(amount, userId);
		this.numberSelected = numberSelected;
	}
	public int getNumberSelected() {
		return numberSelected;
	}
	public void setNumberSelected(int numberSelected) {
		this.numberSelected = numberSelected;
	}
}
