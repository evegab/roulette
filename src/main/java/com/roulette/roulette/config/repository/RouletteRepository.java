package com.roulette.roulette.config.repository;
import java.util.Map;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import com.roulette.roulette.model.BetModel;
import com.roulette.roulette.model.RouletteModel;
@Repository
public class RouletteRepository implements RouletteInterface {
	private static final String KEY = "Roulette";
	private RedisTemplate<String, RouletteModel> redisTemplate;
	private HashOperations hashOperations;
	public RouletteRepository(RedisTemplate<String, RouletteModel> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();
	}
	@Override
	public boolean createRoulette(String id, RouletteModel roulette) {
		try{ 
			hashOperations.put(KEY, id, roulette);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	@Override
	public boolean openRoulette(String id) {
		try {
			RouletteModel roulette = (RouletteModel) hashOperations.get(KEY, id);
			roulette.setStatus(true);
			hashOperations.put(KEY, roulette.getId(),roulette);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	public void betOnColour(String rouletteid, BetModel betModel) {
		// TODO Auto-generated method stub

	}
	public void betOnNumber(String rouletteid, BetModel betModel) {
		// TODO Auto-generated method stub

	}
	@Override
	public Map<String, RouletteModel> closeRoulette(String id) {
		try {
			RouletteModel roulette = (RouletteModel) hashOperations.get(KEY, id);
			roulette.setStatus(false);
			roulette.closeBets();
			hashOperations.put(KEY, roulette.getId(),roulette);
			return null;
		}catch (Exception e) {
			return null;
		}
	}
	@Override
	public Map<String, RouletteModel> listAllRoulettes() {
		return hashOperations.entries(KEY);
	}
	@Override
	public void betOnNumber(String idRoulette, int number, int amount) {
		// TODO Auto-generated method stub

	}
	@Override
	public void betOnColour(String idRoulette, String colour, int amount) {
		// TODO Auto-generated method stub

	}
}
