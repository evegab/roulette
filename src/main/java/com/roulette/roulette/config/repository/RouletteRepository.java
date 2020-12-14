package com.roulette.roulette.config.repository;
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
	public void closeRoulette(String id) {
		// TODO Auto-generated method stub
		
	}

}
