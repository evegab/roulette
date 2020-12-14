package com.roulette.roulette.model;

public class BetNumberModel extends BetModel {
	private int numberSelected;
	public BetNumberModel(int amount, int numberSelected) {
		super(amount);
		this.numberSelected = numberSelected;
	}
	public int getNumberSelected() {
		return numberSelected;
	}
	public void setNumberSelected(int numberSelected) {
		this.numberSelected = numberSelected;
	}
}
