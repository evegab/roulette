package com.roulette.roulette.controller;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.roulette.roulette.config.repository.RouletteRepository;
import com.roulette.roulette.model.BetModel;
import com.roulette.roulette.model.RouletteModel;
@RestController
public class RouletteController {
	private RouletteRepository rouletteRepository;
	public RouletteController(RouletteRepository rouletteRepository) {
        this.rouletteRepository = rouletteRepository;
    }
    @PostMapping("/roulettes")
    public ResponseEntity<String> createRoulette() {
    	String id = UUID.randomUUID().toString();
    	RouletteModel roulette = new RouletteModel(id);
        boolean response = rouletteRepository.createRoulette(id, roulette);
        if (response)
        	
        	return new ResponseEntity<String>("ok", HttpStatus.OK);
        
        return new ResponseEntity<String>("fail", HttpStatus.BAD_REQUEST);
    }
    @PutMapping("/roulettes/open/{rouletteid}")
    public ResponseEntity<String> openRoulette(@PathVariable String rouletteid) {
        rouletteRepository.openRoulette(rouletteid);
        
        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }
    @PutMapping("/roulettes/bet/{rouletteid}/{keyword}")
    public ResponseEntity<String> betOnRoulette(@PathVariable String rouletteid, 
    		@PathVariable String keyword, @RequestHeader String userid, @RequestBody BetModel betModel
    		) {
        if (keyword == "number") {
        	rouletteRepository.betOnNumber(rouletteid, betModel);
        	
        	return new ResponseEntity<String>("ok", HttpStatus.OK);
        }else if(keyword == "colour") {
        	rouletteRepository.betOnColour(rouletteid, betModel);
        	
        	return new ResponseEntity<String>("ok", HttpStatus.OK);
        }else {
        	
        	return new ResponseEntity<String>("ok", HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/roulettes/close/{rouletteid}")
    public ResponseEntity<Map<String,RouletteModel>> closeRoulette(@PathVariable String rouletteid) {
        rouletteRepository.closeRoulette(rouletteid);
        
        return new ResponseEntity<Map<String,RouletteModel>>(rouletteRepository.closeRoulette(rouletteid), HttpStatus.OK);
    }
	@GetMapping("/roulettes")
	 public Map<String, RouletteModel> listRoulettes() {
		
        return rouletteRepository.listAllRoulettes();
    }
}
