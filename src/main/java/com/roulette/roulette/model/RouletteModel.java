package com.roulette.roulette.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RouletteModel implements Serializable {
	private String id;
	private List<BetNumberModel> betOfNumbers;
	private List<BetColourModel> betOfColours;
	private int WinningNumber;
	public RouletteModel(String id) {
		super();
		this.id = id;
		this.betOfNumbers = new ArrayList<BetNumberModel>();
		this.betOfColours = new ArrayList<BetColourModel>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<BetNumberModel> getBetOfNumbers() {
		return betOfNumbers;
	}
	public void setBetOfNumbers(BetNumberModel bet) {
		this.betOfNumbers.add(bet);
	}
	public List<BetColourModel> getBetOfColours() {
		return betOfColours;
	}
	public void setBetOfColours(BetColourModel bet) {
		this.betOfColours.add(bet);
	}
	public int getWinningNumber() {
		return WinningNumber;
	}
	public void setWinningNumber(int winningNumber) {
		WinningNumber = winningNumber;
	}
	
	
}
