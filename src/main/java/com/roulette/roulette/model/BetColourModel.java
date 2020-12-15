package com.roulette.roulette.model;
public class BetColourModel extends BetModel{
	private String colourSelected;
	public BetColourModel(int amount, String colourSelected, int userId) {
		super(amount, userId);
		this.colourSelected = colourSelected;
	}
	public String getColourSelected() {
		return colourSelected;
	}
	public void setColourSelected(String colourSelected) {
		this.colourSelected = colourSelected;
	}
}
