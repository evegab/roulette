package com.roulette.roulette.config.repository;
import java.util.Map;
import com.roulette.roulette.model.RouletteModel;
public interface RouletteInterface {
    boolean createRoulette(String id,RouletteModel roulette);
    boolean openRoulette(String id);
    void betOnNumber(String idRoulette, int number, int amount);
    void betOnColour(String idRoulette, String colour, int amount);
    Map<String,RouletteModel> closeRoulette(String id);
    Map<String,RouletteModel> listAllRoulettes();
}
