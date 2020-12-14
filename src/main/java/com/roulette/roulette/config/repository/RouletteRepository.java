package com.roulette.roulette.config.repository;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.roulette.roulette.model.RouletteModel;
@Repository
public class RouletteRepository implements RouletteInterface {
	private static final String KEY = "Roulette";
	@Override
	public void createRoulette(RouletteModel roulette) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openRoulette(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void betOnNumber(String idRoulette, int number, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void betOnColour(String idRoulette, String colour, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, RouletteModel> closeRoulette(String id) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public Map<String, RouletteModel> listAllRoulettes() {
		// TODO Auto-generated method stub
		return null;
	}
}
